
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.UnauthorizedException;
import io.vrap.rmf.base.client.oauth2.StaticTokenSupplier;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class OAuthMiddlewareTest {

    @Test
    public void testAddToken() {
        AuthenticationToken token = new AuthenticationToken();
        token.setAccessToken("12345");

        OAuthMiddleware middleware = new OAuthMiddleware(new OAuthHandler(new StaticTokenSupplier(token)));

        final ApiHttpRequest request = new ApiHttpRequest(ApiHttpMethod.GET, URI.create("/"), new ApiHttpHeaders(),
            "".getBytes());

        AtomicReference<String> authorizationHeader = new AtomicReference<>();
        blockingWait(middleware.invoke(request, request1 -> {
            authorizationHeader.set(request1.getHeaders().getHeaders(ApiHttpHeaders.AUTHORIZATION).get(0).getValue());
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(200, new ApiHttpHeaders(), "".getBytes()));
        }), Duration.ofSeconds(1));
        Assertions.assertThat(authorizationHeader.get()).isEqualTo("Bearer 12345");
    }

    @Test
    public void testRetryWithStatusCode() {
        AuthenticationToken token = new AuthenticationToken();
        token.setAccessToken("12345");

        OAuthMiddleware middleware = new OAuthMiddleware(new OAuthHandler(new StaticTokenSupplier(token)));

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        final ApiHttpResponse<byte[]> apiHttpResponse = blockingWait(middleware.invoke(request, request1 -> {
            count.getAndIncrement();
            return CompletableFuture.completedFuture(new ApiHttpResponse<>(401, null, null));
        }), Duration.ofSeconds(1));
        Assertions.assertThat(apiHttpResponse.getStatusCode()).isEqualTo(401);
        Assertions.assertThat(count.get()).isEqualTo(2);
    }

    @Test
    public void testRetryWithCoveredException() {
        AuthenticationToken token = new AuthenticationToken();
        token.setAccessToken("12345");

        OAuthMiddleware middleware = new OAuthMiddleware(new OAuthHandler(new StaticTokenSupplier(token)));

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        Assertions.assertThatExceptionOfType(UnauthorizedException.class).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, request1 -> {
                count.getAndIncrement();
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException(new UnauthorizedException(401, null, null, null, null));
                });
            }), Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == 401);
        Assertions.assertThat(count.get()).isEqualTo(2);
    }

    @Test
    public void testRetryWithUncoveredException() {
        AuthenticationToken token = new AuthenticationToken();
        token.setAccessToken("12345");

        OAuthMiddleware middleware = new OAuthMiddleware(new OAuthHandler(new StaticTokenSupplier(token)));

        final ApiHttpRequest request = new ApiHttpRequest();
        AtomicInteger count = new AtomicInteger();

        Assertions.assertThatExceptionOfType(ApiHttpException.class).isThrownBy(() -> {
            blockingWait(middleware.invoke(request, request1 -> {
                count.getAndIncrement();
                return CompletableFuture.supplyAsync(() -> {
                    throw new CompletionException(new ApiHttpException(499, null, null, null, null));
                });
            }), Duration.ofSeconds(1));
        }).matches(e -> e.getStatusCode() == 499);
        Assertions.assertThat(count.get()).isEqualTo(1);
    }
}
