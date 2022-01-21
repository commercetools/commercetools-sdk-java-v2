
package io.vrap.rmf.base.client.oauth2;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.ApiHttpResponse;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientCredentialsTokenSupplierTest {
    @Test
    public void testTokenUrlHint() {
        final ClientCredentialsTokenSupplier tokenSupplier = new ClientCredentialsTokenSupplier("", "", "", "",
            request -> CompletableFuture.completedFuture(
                new ApiHttpResponse<>(405, null, "".getBytes(StandardCharsets.UTF_8), "Method not allowed")));
        Assertions.assertThatExceptionOfType(AuthException.class).isThrownBy(() -> {
            blockingWait(tokenSupplier.getToken(), Duration.ofSeconds(1));
        })
                .matches(e -> e.getStatusCode() == 405)
                .matches(e -> e.getMessage()
                        .contains(
                            ": auth token URI may be incorrect e.g. https://auth.europe-west1.gcp.commercetools.com/oauth/token"),
                    ": auth token URI may be incorrect e.g. https://auth.europe-west1.gcp.commercetools.com/oauth/token");
    }
}
