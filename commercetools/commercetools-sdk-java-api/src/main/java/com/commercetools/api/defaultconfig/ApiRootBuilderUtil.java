
package com.commercetools.api.defaultconfig;

import static java.util.Arrays.asList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.apache.commons.lang3.tuple.ImmutablePair;

public class ApiRootBuilderUtil {

    public static final String ENVIRONMENT_VARIABLE_REGION_SUFFIX = "REGION";
    public static final String ENVIRONMENT_VARIABLE_API_URL_SUFFIX = "API_URL";
    public static final String ENVIRONMENT_VARIABLE_AUTH_URL_SUFFIX = "AUTH_URL";
    public static final String ENVIRONMENT_VARIABLE_PROJECT_KEY_SUFFIX = "PROJECT_KEY";
    public static final String ENVIRONMENT_VARIABLE_CLIENT_ID_SUFFIX = "CLIENT_ID";
    public static final String ENVIRONMENT_VARIABLE_CLIENT_SECRET_SUFFIX = "CLIENT_SECRET";
    public static final String ENVIRONMENT_VARIABLE_SCOPES_SUFFIX = "SCOPES";

    public static final String PROPERTIES_KEY_REGION_SUFFIX = "region";
    public static final String PROPERTIES_KEY_API_URL_SUFFIX = "apiUrl";
    public static final String PROPERTIES_KEY_AUTH_URL_SUFFIX = "authUrl";
    public static final String PROPERTIES_KEY_PROJECT_KEY_SUFFIX = "projectKey";
    public static final String PROPERTIES_KEY_CLIENT_ID_SUFFIX = "clientId";
    public static final String PROPERTIES_KEY_CLIENT_SECRET_SUFFIX = "clientSecret";
    public static final String PROPERTIES_KEY_SCOPES_SUFFIX = "scopes";

    private ApiRootBuilderUtil() {
    }

    public static ApiRootBuilder ofEnvironmentVariables(final String prefix,
            final Function<String, String> getEnvironmentVariable) {
        Objects.requireNonNull(prefix);

        final Map<String, String> configMap = asList(ENVIRONMENT_VARIABLE_API_URL_SUFFIX,
            ENVIRONMENT_VARIABLE_AUTH_URL_SUFFIX, ENVIRONMENT_VARIABLE_PROJECT_KEY_SUFFIX,
            ENVIRONMENT_VARIABLE_CLIENT_ID_SUFFIX, ENVIRONMENT_VARIABLE_CLIENT_SECRET_SUFFIX,
            ENVIRONMENT_VARIABLE_SCOPES_SUFFIX, ENVIRONMENT_VARIABLE_REGION_SUFFIX).stream().map(suffix -> {
                final String key = buildEnvKey(prefix, suffix);
                final String nullableValue = getEnvironmentVariable.apply(key);
                return new ImmutablePair<>(suffix, nullableValue);
            })
                    .filter(pair -> null != pair.getRight())
                    .collect(Collectors.toMap(ImmutablePair::getLeft, ImmutablePair::getRight));

        final Function<String, String> throwExceptionOnAbsent = key -> throwEnvException(prefix,
            buildEnvKey(prefix, key));

        final String projectKey = configMap.computeIfAbsent(ENVIRONMENT_VARIABLE_PROJECT_KEY_SUFFIX,
            throwExceptionOnAbsent);
        final String clientId = configMap.computeIfAbsent(ENVIRONMENT_VARIABLE_CLIENT_ID_SUFFIX,
            throwExceptionOnAbsent);
        final String clientSecret = configMap.computeIfAbsent(ENVIRONMENT_VARIABLE_CLIENT_SECRET_SUFFIX,
            throwExceptionOnAbsent);
        final ServiceRegion region = ServiceRegion
                .valueOf(configMap.getOrDefault(ENVIRONMENT_VARIABLE_REGION_SUFFIX, "GCP_EUROPE_WEST1"));
        final String apiUrl = configMap.getOrDefault(ENVIRONMENT_VARIABLE_API_URL_SUFFIX, region.getApiUrl());
        final String authUrl = configMap.getOrDefault(ENVIRONMENT_VARIABLE_AUTH_URL_SUFFIX, region.getOAuthTokenUrl());
        final String scopes = configMap.get(ENVIRONMENT_VARIABLE_SCOPES_SUFFIX);

        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(clientId)
                        .withClientSecret(clientSecret)
                        .withScopes(scopes)
                        .build(),
                    authUrl, apiUrl)
                .withProjectKey(projectKey);
    }

    private static String buildEnvKey(final String prefix, final String suffix) {
        return prefix + "_" + suffix;
    }

    private static String throwEnvException(final String prefix, final String missingKey) {
        throw new IllegalArgumentException("Missing environment variable '" + missingKey + "'.\n" + "Usage:\n"
                + "export " + buildEnvKey(prefix, ENVIRONMENT_VARIABLE_PROJECT_KEY_SUFFIX) + "=\"YOUR project key\"\n"
                + "export " + buildEnvKey(prefix, ENVIRONMENT_VARIABLE_CLIENT_ID_SUFFIX) + "=\"YOUR client id\"\n"
                + "export " + buildEnvKey(prefix, ENVIRONMENT_VARIABLE_CLIENT_SECRET_SUFFIX)
                + "=\"YOUR client secret\"\n" + "#optional:\n" + "export "
                + buildEnvKey(prefix, ENVIRONMENT_VARIABLE_API_URL_SUFFIX)
                + "=\"https://api.europe-west1.gcp.commercetools.com\"\n" + "export "
                + buildEnvKey(prefix, ENVIRONMENT_VARIABLE_AUTH_URL_SUFFIX)
                + "=\"https://auth.europe-west1.gcp.commercetools.com\"\n" + "export "
                + buildEnvKey(prefix, ENVIRONMENT_VARIABLE_SCOPES_SUFFIX) + "=\"manage_project\"");
    }

    public static ApiRootBuilder ofProperties(final Properties properties, final String prefix) {
        final String projectKey = extract(properties, prefix, PROPERTIES_KEY_PROJECT_KEY_SUFFIX);
        final String clientId = extract(properties, prefix, PROPERTIES_KEY_CLIENT_ID_SUFFIX);
        final String clientSecret = extract(properties, prefix, PROPERTIES_KEY_CLIENT_SECRET_SUFFIX);
        final ServiceRegion region = ServiceRegion
                .valueOf(extract(properties, prefix, PROPERTIES_KEY_REGION_SUFFIX, "GCP_EUROPE_WEST1"));
        final String apiUrl = extract(properties, prefix, PROPERTIES_KEY_API_URL_SUFFIX, region.getApiUrl());
        final String authUrl = extract(properties, prefix, PROPERTIES_KEY_AUTH_URL_SUFFIX, region.getOAuthTokenUrl());
        final String scopes = extract(properties, prefix, PROPERTIES_KEY_SCOPES_SUFFIX);
        return ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(clientId)
                        .withClientSecret(clientSecret)
                        .withScopes(scopes)
                        .build(),
                    authUrl, apiUrl)
                .withProjectKey(projectKey);
    }

    private static String extract(final Properties properties, final String prefix, final String suffix) {
        final String mapKey = buildPropKey(prefix, suffix);
        return properties.computeIfAbsent(mapKey, key -> throwPropertiesException(prefix, mapKey)).toString();
    }

    private static String extract(final Properties properties, final String prefix, final String suffix,
            final String defaultValue) {
        return properties.getProperty(buildPropKey(prefix, suffix), defaultValue);
    }

    private static String buildPropKey(final String prefix, final String suffix) {
        return prefix + suffix;
    }

    private static String throwPropertiesException(final String prefix, final String missingKey) {
        throw new IllegalArgumentException("Missing property value '" + missingKey + "'.\n" + "Usage:\n" + ""
                + buildPropKey(prefix, PROPERTIES_KEY_PROJECT_KEY_SUFFIX) + "=YOUR project key\n" + ""
                + buildPropKey(prefix, PROPERTIES_KEY_CLIENT_ID_SUFFIX) + "=YOUR client id\n" + ""
                + buildPropKey(prefix, PROPERTIES_KEY_CLIENT_SECRET_SUFFIX) + "=YOUR client secret\n" + "#optional:\n"
                + "" + buildPropKey(prefix, PROPERTIES_KEY_API_URL_SUFFIX)
                + "=https://api.europe-west1.gcp.commercetools.com\n" + ""
                + buildPropKey(prefix, PROPERTIES_KEY_AUTH_URL_SUFFIX)
                + "=https://auth.europe-west1.gcp.commercetools.com\n" + ""
                + buildPropKey(prefix, PROPERTIES_KEY_SCOPES_SUFFIX) + "=manage_project"
                + "#don't use quotes for the property values\n");
    }
}
