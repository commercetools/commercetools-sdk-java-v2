package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;

import java.util.List;

import static java.util.Arrays.asList;

public class MiddlewareFactory {
    private final static String userAgent = buildUserAgent();

    @Deprecated
    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final Logger logger)
    {
        return createDefault(tokenSupplier, request -> InternalLogger.getLogger(ClientFactory.COMMERCETOOLS));
    }

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final InternalLoggerFactory internalLoggerFactory)
    {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return asList(
                (request, next) -> {
                    request.withHeader(ApiHttpHeaders.USER_AGENT, userAgent);
                    return next.apply(request);
                },
                new ErrorMiddleware(),
                new InternalLoggerMiddleware(internalLoggerFactory),
                new OAuthMiddleware(oAuthHandler)
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
