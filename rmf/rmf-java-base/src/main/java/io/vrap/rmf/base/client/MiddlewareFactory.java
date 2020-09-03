package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.apache.commons.lang3.SystemUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiddlewareFactory {
    private final static String userAgent = buildUserAgent();

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final Logger logger)
    {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return new ArrayList<>(Arrays.asList(
                new OAuthMiddleware(oAuthHandler),
                new ReAuthMiddleware(oAuthHandler, 1),
                (request, next) -> {
                    request.addHeader(ApiHttpHeaders.USER_AGENT, userAgent);
                    return next.apply(request);
                },
                new LoggerMiddleware(logger, Level.INFO)
        ));
    }

    private static String buildUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch + ")";
    }
}
