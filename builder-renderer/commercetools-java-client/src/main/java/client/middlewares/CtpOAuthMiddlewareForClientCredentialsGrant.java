package client.middlewares;

import client.Middleware;
import client.MiddlewareArg;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import java.util.concurrent.CompletableFuture;

public final class CtpOAuthMiddlewareForClientCredentialsGrant implements Middleware {

    private final String clientId;
    private final String clientSecret;
    private final String accessTokenEndpoint;
    private final String authorizationBaseUrl;
    private final String scope;
    private final OAuth20Service oAuth20Service;
    private OAuth2AccessToken oAuth2AccessToken;



    public CtpOAuthMiddlewareForClientCredentialsGrant(String clientId, String clientSecret, String scope, String accessTokenEndpoint, String authorizationBaseUrl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.accessTokenEndpoint = accessTokenEndpoint;
        this.authorizationBaseUrl = authorizationBaseUrl;
        this.scope = scope;
        final ServiceBuilder serviceBuilder = new ServiceBuilder(clientId)
                .apiSecret(clientSecret);
        if(this.scope !=null && !this.scope.isEmpty()){
            serviceBuilder.defaultScope(this.scope);
        }
        oAuth20Service = serviceBuilder.build(new CtpApi2());
    }


    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getAccessTokenEndpoint() {
        return accessTokenEndpoint;
    }

    public String getAuthorizationBaseUrl() {
        return authorizationBaseUrl;
    }

    public String getScope() {
        return scope;
    }

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {

        try {
            //TODO  We have to do caching here
            String accessToken = oAuth20Service.getAccessTokenClientCredentialsGrant().getAccessToken();
            arg.getRequest().addHeader("Authorization", "Bearer " + accessToken);
            return arg.getNext().next(arg);
        } catch (Exception e) {
            MiddlewareArg erroredArg = MiddlewareArg.from(arg.getRequest(), arg.getResponse(), e, arg.getNext());
            return arg.getNext().next(erroredArg);
        }
    }

    private class CtpApi2 extends DefaultApi20 {
        @Override
        public String getAccessTokenEndpoint() {
            return accessTokenEndpoint;
        }

        @Override
        protected String getAuthorizationBaseUrl() {
            return authorizationBaseUrl;
        }
    }
}
