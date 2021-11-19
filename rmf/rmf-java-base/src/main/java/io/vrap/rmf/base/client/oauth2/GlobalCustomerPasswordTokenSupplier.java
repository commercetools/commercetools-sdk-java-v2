
package io.vrap.rmf.base.client.oauth2;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import io.vrap.rmf.base.client.*;

/**
 * Token supplier using password flow
 */
public class GlobalCustomerPasswordTokenSupplier extends BaseAuthTokenSupplier implements TokenSupplier {

    public GlobalCustomerPasswordTokenSupplier(final String clientId, final String clientSecret, final String email,
            final String password, final String scope, final String tokenEndpoint,
            final VrapHttpClient vrapHttpClient) {
        super(vrapHttpClient, constructApiHttpRequest(clientId, clientSecret, email, password, scope, tokenEndpoint));
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String email, final String password, final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));

        final String body;
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=password&username=" + email + "&password=" + password;
        }
        else {
            body = "grant_type=password&username=" + email + "&password=" + password + "&scope=" + scope;
        }
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders().withHeader("Authorization", "Basic " + auth)
                .withHeader("Content-Type", "application/x-www-form-urlencoded");
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), apiHttpHeaders,
            body.getBytes(StandardCharsets.UTF_8));
    }
}
