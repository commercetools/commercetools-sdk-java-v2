
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OAuthHandlerTest {

    @Test
    public void testExpiredToken() {
        TestSupplier supplier = new TestSupplier();
        OAuthHandler handler = new OAuthHandler(supplier);
        final AuthenticationToken token = handler.getToken();
        Assertions.assertThat(token.getAccessToken()).isEqualTo("123456");
        Assertions.assertThat(supplier.firstCall).isFalse();

        final AuthenticationToken token2 = handler.getToken();
        Assertions.assertThat(token2.getAccessToken()).isEqualTo("123456");
    }

    private static class TestSupplier implements TokenSupplier {
        public boolean firstCall = true;
        private final AuthenticationToken expiredToken;
        private final AuthenticationToken notExpiredToken;

        public TestSupplier() {
            expiredToken = new AuthenticationToken();
            expiredToken.setAccessToken("12345");
            expiredToken.setExpiresIn(10L);

            notExpiredToken = new AuthenticationToken();
            notExpiredToken.setAccessToken("123456");
            notExpiredToken.setExpiresIn(310L);
        }

        @Override
        public CompletableFuture<AuthenticationToken> getToken() {
            if (firstCall) {
                firstCall = false;
                return CompletableFuture.completedFuture(expiredToken);
            }
            return CompletableFuture.completedFuture(notExpiredToken);
        }
    }
}
