package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;

import java.util.List;

import static java.util.Arrays.asList;

public class MiddlewareFactory {
    private final static String userAgent = buildUserAgent();

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final Logger logger)
    {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return asList(
                new ErrorMiddleware(),
                new LoggerMiddleware(logger),
                new OAuthMiddleware(oAuthHandler),
                new ReAuthMiddleware(oAuthHandler, 1),
                (request, next) -> {
                    request.withHeader(ApiHttpHeaders.USER_AGENT, userAgent);
                    return next.apply(request);
                }
        );
    }

    private static String buildUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch + ")";
    }
}
