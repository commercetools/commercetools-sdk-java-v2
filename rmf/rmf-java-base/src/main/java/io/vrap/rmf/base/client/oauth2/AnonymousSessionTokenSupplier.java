
package io.vrap.rmf.base.client.oauth2;

import static io.vrap.rmf.base.client.ApiHttpHeaders.headerEntry;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import io.vrap.rmf.base.client.*;

/**
 * Token supplier using anonymous flow
 */
public class AnonymousSessionTokenSupplier extends BaseAuthTokenSupplier implements TokenSupplier {

    public AnonymousSessionTokenSupplier(final String clientId, final String clientSecret, final String scope,
            final String tokenEndpoint, final VrapHttpClient vrapHttpClient) {
        super(vrapHttpClient, constructApiHttpRequest(clientId, clientSecret, scope, tokenEndpoint));
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));
        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(
            headerEntry(ApiHttpHeaders.AUTHORIZATION, "Basic " + auth),
            headerEntry(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded"));
        final String body;
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=client_credentials";
        }
        else {
            body = "grant_type=client_credentials&scope=" + scope;
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), apiHttpHeaders,
            body.getBytes(StandardCharsets.UTF_8));
    }
}
