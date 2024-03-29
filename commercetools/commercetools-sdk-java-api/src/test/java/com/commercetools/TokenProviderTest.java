
package com.commercetools;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.*;
import io.vrap.rmf.base.client.utils.ClientUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TokenProviderTest {

    static class TestClient implements VrapHttpClient {
        private ApiHttpResponse<byte[]> cannedResponse;

        public ApiHttpResponse<byte[]> getCannedResponse() {
            return cannedResponse;
        }

        public TestClient() {
            this.cannedResponse = new ApiHttpResponse<>(200, null,
                "{\"access_token\": \"abc\", \"expires_in\": 3600}".getBytes(StandardCharsets.UTF_8));
        }

        @Override
        public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
            called++;
            lastUrl = request.getUri().toString();
            return CompletableFuture.completedFuture(cannedResponse);
        }

        private int called = 0;

        public int getCalled() {
            return called;
        }

        public void setCalled(int called) {
            this.called = called;
        }

        public String lastUrl;

        public String getLastUrl() {
            return lastUrl;
        }

        public void setLastUrl(String lastUrl) {
            this.lastUrl = lastUrl;
        }

        public void setCannedResponse(ApiHttpResponse<byte[]> response) {
            cannedResponse = response;
        }
    }
    //
    private final Supplier<ExecutorService> oauthExecutorService = ForkJoinPool::new;

    private RefreshableTokenSupplier createInMemoryTokenSupplier(TokenSupplier tokenSupplier) {
        return Optional.ofNullable(oauthExecutorService)
                .map(executorService -> new InMemoryTokenSupplier(executorService.get(), tokenSupplier))
                .orElse(new InMemoryTokenSupplier(tokenSupplier));
    }

    private TokenSupplier createClientCredentialsTokenSupplier(final ClientCredentials credentials,
            final String tokenEndpoint, final VrapHttpClient httpClient) {
        return new ClientCredentialsTokenSupplier(credentials.getClientId(), credentials.getClientSecret(),
            credentials.getScopes(), tokenEndpoint, httpClient);
    }

    public RefreshableTokenSupplier withClientCredentialsFlow(final ClientCredentials credentials,
            final String tokenEndpoint, Supplier<HandlerStack> httpClientSupplier) {
        return createInMemoryTokenSupplier(
            createClientCredentialsTokenSupplier(credentials, tokenEndpoint, httpClientSupplier.get()));
    }

    private Supplier<HandlerStack> oauthHandlerSupplier(VrapHttpClient client) {
        return () -> {
            final List<Middleware> middlewareStack = new ArrayList<>();
            return HandlerStack.create(HttpHandler.create(client), middlewareStack);
        };
    }

    @Test
    public void expiredTokens() throws ExecutionException, InterruptedException, TimeoutException {
        TestClient client = new TestClient();
        RefreshableTokenSupplier tokenSupplier = withClientCredentialsFlow(
            ClientCredentials.of().withClientId("").withClientSecret("").build(),
            "http://auth.commercetools.com/oauth/token", oauthHandlerSupplier(client));

        AuthenticationToken token = tokenSupplier.getToken().get();

        Assertions.assertThat(token).isNotNull();
        Assertions.assertThat(client.getCalled()).isEqualTo(1);
        Assertions.assertThat(client.getLastUrl()).isEqualTo("http://auth.commercetools.com/oauth/token");

        tokenSupplier.getToken().get();
        Assertions.assertThat(client.getCalled()).isEqualTo(1);

        Random random = new Random();
        tokenSupplier.refreshToken();
        final ArrayList<CompletableFuture<AuthenticationToken>> completableFutures = new ArrayList<>(1000000);

        for (int i = 0; i < 1000000; i++) {
            if (random.nextInt(1000) < 100) {
                tokenSupplier.refreshToken();
            }
            completableFutures.add(tokenSupplier.getToken());
        }
        ClientUtils.blockingWaitForEach(completableFutures, 3, TimeUnit.SECONDS);
        Assertions.assertThat(client.getCalled()).isGreaterThan(1);

        completableFutures.forEach(authTokenFuture -> {
            try {
                Assertions.assertThat(authTokenFuture.get().getAccessToken()).isEqualTo("abc");
            }
            catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        token = tokenSupplier.getToken().get();
        Assertions.assertThat(token).isNotNull();
    }

    @Test
    public void expiredTokensOAuthHandler() throws ExecutionException, InterruptedException, TimeoutException {
        TestClient client = new TestClient();

        AuthenticationToken token;
        try (OAuthHandler handler = new OAuthHandler(
            withClientCredentialsFlow(ClientCredentials.of().withClientId("").withClientSecret("").build(),
                "http://auth.commercetools.com/oauth/token", oauthHandlerSupplier(client)))) {
            token = handler.getTokenAsync().get();

            Assertions.assertThat(token).isNotNull();
            Assertions.assertThat(client.getCalled()).isEqualTo(1);
            Assertions.assertThat(client.getLastUrl()).isEqualTo("http://auth.commercetools.com/oauth/token");

            handler.getTokenAsync().get();
            Assertions.assertThat(client.getCalled()).isEqualTo(1);

            Random random = new Random();
            handler.refreshTokenAsync();
            final ArrayList<CompletableFuture<AuthenticationToken>> completableFutures = new ArrayList<>(1000000);

            client.setCannedResponse(client.getCannedResponse()
                    .withBody("{\"access_token\": \"def\", \"expires_in\": 3600}".getBytes(StandardCharsets.UTF_8)));
            handler.refreshTokenAsync();
            for (int i = 0; i < 1000000; i++) {
                if (random.nextInt(1000) < 100) {
                    handler.refreshTokenAsync();
                }
                completableFutures.add(handler.getTokenAsync());
            }
            ClientUtils.blockingWaitForEach(completableFutures, 3, TimeUnit.SECONDS);
            Assertions.assertThat(client.getCalled()).isGreaterThan(1);

            completableFutures.forEach(authTokenFuture -> {
                try {
                    Assertions.assertThat(authTokenFuture.get().getAccessToken()).isIn("abc", "def");
                }
                catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });

            token = handler.getTokenAsync().get();
            Assertions.assertThat(token).isNotNull();
        }
    }
}
