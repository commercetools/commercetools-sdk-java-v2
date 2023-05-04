
package io.vrap.rmf.base.client;

import static java.util.stream.Collectors.joining;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Stream;

import org.apache.commons.lang3.SystemUtils;
import org.slf4j.LoggerFactory;

final class UserAgentUtils {
    private UserAgentUtils() {
    }

    final static String unknownUserAgent = "commercetools-java-v2/unknown";
    static final String userAgent = "commercetools-sdk-java-v2";

    static String obtainUserAgent() {
        try {
            return userAgent(Collections.emptyList());
        }
        catch (final Exception e) {
            LoggerFactory.getLogger(UserAgentUtils.class).error("cannot determine user agent", e);
            return unknownUserAgent;
        }
    }

    static String obtainUserAgent(List<SolutionInfo> additionalSolutionInfos) {
        try {
            return userAgent(additionalSolutionInfos);
        }
        catch (final Exception e) {
            LoggerFactory.getLogger(UserAgentUtils.class).error("cannot determine user agent", e);
            return unknownUserAgent;
        }
    }

    private static String userAgent(List<SolutionInfo> additionalSolutionInfos) {
        return MessageFormat
                .format("{0}/{1} Java/{2} ({3}; {4}) {5}", userAgent, BuildInfo.VERSION,
                    SystemUtils.JAVA_RUNTIME_VERSION, SystemUtils.OS_NAME, SystemUtils.OS_ARCH,
                    getSolutionInfoString(additionalSolutionInfos))
                .trim();
    }

    private static String getSolutionInfoString(List<SolutionInfo> additionalSolutionInfos) {
        return Stream.of(SolutionInfoService.getInstance().getSolutionInfos(), additionalSolutionInfos)
                .flatMap(Collection::stream)
                .map(UserAgentUtils::format)
                .collect(joining(" "));
    }

    public static String format(final SolutionInfo solutionInfo) {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(solutionInfo.getName()).append("/").append(solutionInfo.getVersion());
        if (isNotEmpty(solutionInfo.getWebsite()) && isNotEmpty(solutionInfo.getEmergencyContact())) {
            stringBuilder.append(" (");
            final String details = Stream.of(solutionInfo.getWebsite(), solutionInfo.getEmergencyContact())
                    .filter(Objects::nonNull)
                    .map(s -> "+" + s)
                    .collect(joining("; "));
            stringBuilder.append(details);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}
