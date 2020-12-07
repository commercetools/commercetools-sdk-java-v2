package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;

import java.util.List;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class MiddlewareFactory {
    @Deprecated
    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final Logger logger)
    {
        return createDefault(tokenSupplier, request -> InternalLogger.getLogger(ClientFactory.COMMERCETOOLS));
    }

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final InternalLoggerFactory internalLoggerFactory)
    {
        return createDefault(tokenSupplier, internalLoggerFactory, MiddlewareFactory::buildUserAgent);
    }

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier, final InternalLoggerFactory internalLoggerFactory, final Supplier<String> userAgent)
    {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return asList(
                (request, next) -> next.apply(request.withHeader(ApiHttpHeaders.USER_AGENT, userAgent.get())),
                new ErrorMiddleware(),
                new InternalLoggerMiddleware(internalLoggerFactory),
                new OAuthMiddleware(oAuthHandler)
        );
    }

    public static String buildUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch + ")";
    }
}
