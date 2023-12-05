
package io.vrap.rmf.base.client.oauth2;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import io.vrap.rmf.base.client.*;

/**
 * Token supplier using client credentials flow
 */
public class ClientCredentialsTokenSupplier extends BaseAuthTokenSupplier {

    public ClientCredentialsTokenSupplier(final String clientId, final String clientSecret, final String scope,
            final String tokenEndpoint, final VrapHttpClient vrapHttpClient) {
        super(vrapHttpClient, constructApiHttpRequest(clientId, clientSecret, scope, tokenEndpoint));
    }

    public ClientCredentialsTokenSupplier(final String clientId, final String clientSecret, final String scope,
            final String tokenEndpoint, final VrapHttpClient vrapHttpClient, final ResponseSerializer serializer) {
        super(vrapHttpClient, constructApiHttpRequest(clientId, clientSecret, scope, tokenEndpoint), serializer);
    }

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));

        final ApiHttpHeaders headers = new ApiHttpHeaders()
                .withHeader(ApiHttpHeaders.AUTHORIZATION, String.format("Basic %s", auth))
                .withHeader(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");

        String body = "";
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=client_credentials";

        }
        else {
            body = String.format("grant_type=client_credentials&scope=%s", urlEncode(scope));
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), headers,
            body.getBytes(StandardCharsets.UTF_8));
    }

}
