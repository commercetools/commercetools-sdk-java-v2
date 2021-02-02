
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class OAuthHandlerTest {
    @Test
    public void testExpiredToken() {
        AuthenticationToken expiredToken = new AuthenticationToken();
        expiredToken.setAccessToken("12345");
        expiredToken.setExpiresIn(10L);

        AuthenticationToken notExpiredToken = new AuthenticationToken();
        notExpiredToken.setAccessToken("123456");
        notExpiredToken.setExpiresIn(310L);

        OAuthHandler handler = new OAuthHandler(new TokenSupplier() {
            private boolean firstCall = true;
            @Override
            public CompletableFuture<AuthenticationToken> getToken() {
                if (firstCall) {
                    firstCall = false;
                    return CompletableFuture.completedFuture(expiredToken);
                }
                return CompletableFuture.completedFuture(notExpiredToken);
            }
        });
        final AuthenticationToken token = handler.getToken();
        Assertions.assertThat(token.getAccessToken()).isEqualTo("12345");

        final AuthenticationToken token2 = handler.getToken();
        Assertions.assertThat(token2.getAccessToken()).isEqualTo("123456");
    }
}
