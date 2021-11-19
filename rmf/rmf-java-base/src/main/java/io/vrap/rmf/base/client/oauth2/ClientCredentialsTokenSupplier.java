
package io.vrap.rmf.base.client.oauth2;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
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

    private static ApiHttpRequest constructApiHttpRequest(final String clientId, final String clientSecret,
            final String scope, final String tokenEndpoint) {
        String auth = Base64.getEncoder()
                .encodeToString((clientId + ":" + clientSecret).getBytes(StandardCharsets.UTF_8));

        final ApiHttpHeaders headers = new ApiHttpHeaders().withHeader(ApiHttpHeaders.AUTHORIZATION, "Basic " + auth)
                .withHeader(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");

        String body = "";
        if (scope == null || scope.isEmpty()) {
            body = "grant_type=client_credentials";

        }
        else {
            try {
                body = "grant_type=client_credentials&scope="
                        + URLEncoder.encode(scope, StandardCharsets.UTF_8.toString());
            }
            catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(tokenEndpoint), headers,
            body.getBytes(StandardCharsets.UTF_8));
    }

}
