
package io.vrap.rmf.base.client;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.apache.commons.lang3.SystemUtils;

/**
 * @deprecated functionality now available using the {@link ClientBuilder}
 */
@Deprecated
public class MiddlewareFactory {
    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory) {
        return createDefault(tokenSupplier, internalLoggerFactory, MiddlewareFactory::buildUserAgent);
    }

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory, final Supplier<String> userAgent) {
        return createDefault(tokenSupplier, internalLoggerFactory, userAgent, ResponseSerializer.of());
    }

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory, final Supplier<String> userAgent,
            final ResponseSerializer serializer) {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return asList(
            (request,
                    next) -> next.apply(request.withHeader(ApiHttpHeaders.USER_AGENT, userAgent.get())
                            .withHeader(ApiHttpHeaders.ACCEPT_ENCODING, "gzip")),
            ErrorMiddleware.of(serializer), InternalLoggerMiddleware.of(internalLoggerFactory),
            OAuthMiddleware.of(oAuthHandler));
    }

    /**
     * @deprecated use {@link ClientBuilder#buildDefaultUserAgent()} instead
     * @return user agent string
     */
    @Deprecated
    public static String buildUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch
                + ")";
    }
}
