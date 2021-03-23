
package io.vrap.rmf.base.client;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import io.vrap.rmf.base.client.oauth2.StaticTokenSupplier;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AuthenticationTokenTest {
    @Test
    public void testExpiredNotSet() throws IOException {
        final AuthenticationToken token = JsonUtils.fromJsonString("{ \"access_token\": \"12345\"}",
            AuthenticationToken.class);
        Assertions.assertThat(token.isExpired()).isEqualTo(false);
    }

    @Test
    public void testAlreadyExpired() throws IOException {
        final AuthenticationToken token = JsonUtils
                .fromJsonString("{ \"access_token\": \"12345\", \"expires_in\": 299}", AuthenticationToken.class);
        Assertions.assertThat(token.isExpired()).isEqualTo(true);
    }

    @Test
    public void testNotExpired() throws IOException {
        final AuthenticationToken token = JsonUtils
                .fromJsonString("{ \"access_token\": \"12345\", \"expires_in\": 360}", AuthenticationToken.class);
        Assertions.assertThat(token.isExpired()).isEqualTo(false);
    }

    @Test
    public void testStaticTokenSupplier() throws ExecutionException, InterruptedException {
        final AuthenticationToken t = new AuthenticationToken();
        t.setAccessToken("12345");
        final StaticTokenSupplier staticTokenSupplier = new StaticTokenSupplier(t);
        Assertions.assertThat(staticTokenSupplier.getToken().get().isExpired()).isFalse();
    }
}
