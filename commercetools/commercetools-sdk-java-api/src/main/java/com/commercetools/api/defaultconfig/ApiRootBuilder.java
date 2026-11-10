
package com.commercetools.api.defaultconfig;

import java.net.URI;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import javax.annotation.Nullable;

import com.commercetools.api.client.ApiCorrelationIdProvider;
import com.commercetools.api.client.ApiInternalLoggerFactory;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.client.ConcurrentModificationMiddleware;
import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.error.ApiHttpExceptionFactory;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;
import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenStorage;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.slf4j.event.Level;

import dev.failsafe.spi.Scheduler;

/**
 * Builder to create a {@link ApiRoot} or a project scoped {@link ProjectApiRoot}
 */
public class ApiRootBuilder {
    private static final String PROJECT_KEY_MUST_BE_SET = "projectKey must be set";
    private final ClientBuilder builder;
    private String projectKey;

    private ApiRootBuilder(ClientBuilder builder) {
        builder.withHttpExceptionFactory(ApiHttpExceptionFactory::of);
        this.builder = builder;
    }

    public static ApiRootBuilder of() {
        return new ApiRootBuilder(ClientBuilder.of());
    }

    public static ApiRootBuilder of(ExecutorService httpClientExecutorService) {
        return new ApiRootBuilder(ClientBuilder.of(httpClientExecutorService));
    }

    public static ApiRootBuilder of(final ApiHttpClient httpClient) {
        return new ApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static ApiRootBuilder of(final VrapHttpClient httpClient) {
        return new ApiRootBuilder(ClientBuilder.of(httpClient));
    }

    public static ApiRootBuilder ofEnvironmentVariables() {
        return ApiRootBuilderUtil.ofEnvironmentVariables("CTP", System::getenv);
    }

    public static ApiRootBuilder ofEnvironmentVariables(final String prefix) {
        return ApiRootBuilderUtil.ofEnvironmentVariables(prefix, System::getenv);
    }

    public static ApiRootBuilder ofProperties(final Properties properties) {
        return ofProperties(properties, "CTP");
    }

    public static ApiRootBuilder ofProperties(final Properties properties, final String prefix) {
        return ApiRootBuilderUtil.ofProperties(properties, prefix);
    }

    public static ApiRootBuilder of(final HandlerStack stack) {
        return new ApiRootBuilder(ClientBuilder.of(stack));
    }

    public ApiRootBuilder withProjectKey(final String projectKey) {
        this.projectKey = projectKey;

        return this;
    }

    public ApiRootBuilder withAuthCircuitBreaker() {
        return with(ClientBuilder::withAuthCircuitBreaker);
    }

    public ApiRootBuilder withoutAuthCircuitBreaker() {
        return with(ClientBuilder::withoutAuthCircuitBreaker);
    }

    public ApiRootBuilder withAuthRetries(final int authRetries) {
        return with(clientBuilder -> clientBuilder.withAuthRetries(authRetries));
    }

    public ApiRootBuilder withHandlerStack(final HandlerStack stack) {
        return with(clientBuilder -> clientBuilder.withHandlerStack(stack));
    }

    public ApiRootBuilder withHttpClient(final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withHttpClient(httpClient));
    }

    public ApiRootBuilder withSerializer(final ResponseSerializer serializer) {
        return with(clientBuilder -> clientBuilder.withSerializer(serializer));
    }

    public ApiRootBuilder withSerializer(final Supplier<ResponseSerializer> serializer) {
        return with(clientBuilder -> clientBuilder.withSerializer(serializer));
    }

    public ApiRootBuilder withHttpExceptionFactory(final HttpExceptionFactory factory) {
        return with(clientBuilder -> clientBuilder.withHttpExceptionFactory(factory));
    }

    public ApiRootBuilder withHttpExceptionFactory(final Function<ResponseSerializer, HttpExceptionFactory> factory) {
        return with(clientBuilder -> clientBuilder.withHttpExceptionFactory(factory));
    }

    public ApiRootBuilder withHttpExceptionFactory(final Supplier<HttpExceptionFactory> factory) {
        return with(clientBuilder -> clientBuilder.withHttpExceptionFactory(factory));
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials) {
        return defaultClient(credentials, ServiceRegion.GCP_EUROPE_WEST1);
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials, ServiceRegionConfig serviceRegion) {
        return defaultClient(URI.create(serviceRegion.getApiUrl())).withClientCredentialsFlow(credentials,
            serviceRegion.getOAuthTokenUrl());
    }

    public ApiRootBuilder defaultClient(final ClientCredentials credentials, final String tokenEndpoint,
            final String apiEndpoint) {
        return defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ApiRootBuilder defaultClient(final String apiEndpoint, final ClientCredentials credentials,
            final String tokenEndpoint) {
        return defaultClient(URI.create(apiEndpoint)).withClientCredentialsFlow(credentials, tokenEndpoint);
    }

    public ApiRootBuilder defaultClient(final String apiEndpoint) {
        return defaultClient(URI.create(apiEndpoint));
    }

    public ApiRootBuilder defaultClient(final URI apiEndpoint) {
        return with(clientBuilder -> clientBuilder.defaultClient(apiEndpoint)
                .withInternalLoggerFactory(ApiInternalLoggerFactory::get));
    }

    public ApiRootBuilder withOAuthExecutorService(final ExecutorService executorService) {
        return with(clientBuilder -> clientBuilder.withOAuthExecutorService(executorService));
    }

    public ApiRootBuilder withOAuthExecutorService(final Supplier<ExecutorService> executorService) {
        return with(clientBuilder -> clientBuilder.withOAuthExecutorService(executorService));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withClientCredentialsFlow(final ClientCredentials credentials, final URI tokenEndpoint,
            final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withClientCredentialsFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withStaticTokenFlow(final AuthenticationToken token) {
        return with(clientBuilder -> clientBuilder.withStaticTokenFlow(token));
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint) {
        return with(clientBuilder -> clientBuilder.withAnonymousSessionFlow(credentials, tokenEndpoint));
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withAnonymousSessionFlow(final ClientCredentials credentials, final String tokenEndpoint,
            final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousSessionFlow(credentials, tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials,
            final ServiceRegion serviceRegion, final TokenStorage storage) {
        withApiBaseUrl(serviceRegion.getApiUrl());
        Objects.requireNonNull(projectKey, PROJECT_KEY_MUST_BE_SET);
        return withAnonymousRefreshFlow(credentials, serviceRegion.getAnonymousFlowTokenURL(projectKey),
            serviceRegion.getOAuthTokenUrl(), storage);
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials,
            final ServiceRegion serviceRegion, final String projectKey, final TokenStorage storage) {
        withApiBaseUrl(serviceRegion.getApiUrl());
        withProjectKey(projectKey);
        return withAnonymousRefreshFlow(credentials, serviceRegion.getAnonymousFlowTokenURL(projectKey),
            serviceRegion.getOAuthTokenUrl(), storage);
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage) {
        return with(clientBuilder -> clientBuilder.withAnonymousRefreshFlow(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage));
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousRefreshFlow(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient));
    }

    public ApiRootBuilder withAnonymousRefreshFlow(final ClientCredentials credentials, final String anonTokenEndpoint,
            final String refreshTokenEndpoint, final TokenStorage storage, final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withAnonymousRefreshFlow(credentials, anonTokenEndpoint,
            refreshTokenEndpoint, storage, httpClient));
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint) {
        return with(
            clientBuilder -> clientBuilder.withGlobalCustomerPasswordFlow(credentials, email, password, tokenEndpoint));
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final Supplier<HandlerStack> httpClient) {
        return with(clientBuilder -> clientBuilder.withGlobalCustomerPasswordFlow(credentials, email, password,
            tokenEndpoint, httpClient));
    }

    public ApiRootBuilder withGlobalCustomerPasswordFlow(final ClientCredentials credentials, final String email,
            final String password, final String tokenEndpoint, final VrapHttpClient httpClient) {
        return with(clientBuilder -> clientBuilder.withGlobalCustomerPasswordFlow(credentials, email, password,
            tokenEndpoint, httpClient));
    }

    public ApiRootBuilder addAcceptGZipMiddleware() {
        return with(ClientBuilder::addAcceptGZipMiddleware);
    }

    public ApiRootBuilder withErrorMiddleware() {
        return with(ClientBuilder::withErrorMiddleware);
    }

    public ApiRootBuilder withErrorMiddleware(ErrorMiddleware.ExceptionMode exceptionMode) {
        return with(clientBuilder -> clientBuilder.withErrorMiddleware(exceptionMode));
    }

    public ApiRootBuilder withErrorMiddleware(final ErrorMiddleware errorMiddleware) {
        return with(clientBuilder -> clientBuilder.withErrorMiddleware(errorMiddleware));
    }

    public ApiRootBuilder withTelemetryMiddleware(final Supplier<TelemetryMiddleware> telemetryMiddleware) {
        return with(clientBuilder -> clientBuilder.withTelemetryMiddleware(telemetryMiddleware));
    }

    public ApiRootBuilder withTelemetryMiddleware(final TelemetryMiddleware telemetryMiddleware) {
        return with(clientBuilder -> clientBuilder.withTelemetryMiddleware(telemetryMiddleware));
    }

    public ApiRootBuilder addConcurrentModificationMiddleware() {
        return addConcurrentModificationMiddleware(ConcurrentModificationMiddleware.of());
    }

    public ApiRootBuilder addConcurrentModificationMiddleware(final int maxRetries) {
        return addConcurrentModificationMiddleware(ConcurrentModificationMiddleware.of(maxRetries));
    }

    public ApiRootBuilder addConcurrentModificationMiddleware(final int maxRetries, final long delay,
            final long maxDelay) {
        return addConcurrentModificationMiddleware(ConcurrentModificationMiddleware.of(maxRetries, delay, maxDelay));
    }

    public ApiRootBuilder addConcurrentModificationMiddleware(ConcurrentModificationMiddleware middleware) {
        return addMiddleware(middleware);
    }

    public ApiRootBuilder addNotFoundExceptionMiddleware(NotFoundExceptionMiddleware notFoundExceptionMiddleware) {
        return with(clientBuilder -> clientBuilder.addNotFoundExceptionMiddleware(notFoundExceptionMiddleware));
    }

    public ApiRootBuilder addNotFoundExceptionMiddleware() {
        return with(ClientBuilder::addNotFoundExceptionMiddleware);
    }

    public ApiRootBuilder addNotFoundExceptionMiddleware(final Set<ApiHttpMethod> method) {
        return with(clientBuilder -> clientBuilder.addNotFoundExceptionMiddleware(method));
    }

    public ApiRootBuilder addNotFoundExceptionMiddleware(final Predicate<ApiHttpRequest> requestPredicate) {
        return with(clientBuilder -> clientBuilder.addNotFoundExceptionMiddleware(requestPredicate));
    }

    public ApiRootBuilder withPolicies(final Function<PolicyBuilder, PolicyBuilder> fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(fn));
    }

    public ApiRootBuilder withPolicies(final PolicyBuilder policyBuilder) {
        return with(clientBuilder -> clientBuilder.withPolicies(policyBuilder));
    }

    public ApiRootBuilder withRequestPolicies(final Function<RequestPolicyBuilder, RequestPolicyBuilder> fn) {
        return with(clientBuilder -> clientBuilder.withRequestPolicies(fn));
    }

    public ApiRootBuilder withRequestPolicies(final RequestPolicyBuilder policyBuilder) {
        return with(clientBuilder -> clientBuilder.withRequestPolicies(policyBuilder));
    }

    public ApiRootBuilder withPolicyMiddleware(final PolicyMiddleware policyMiddleware) {
        return with(clientBuilder -> clientBuilder.withPolicyMiddleware(policyMiddleware));
    }

    public ApiRootBuilder withPolicyMiddleware(final Supplier<PolicyMiddleware> policyMiddleware) {
        return with(clientBuilder -> clientBuilder.withPolicyMiddleware(policyMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final Supplier<RetryRequestMiddleware> retryMiddleware) {
        return with(clientBuilder -> clientBuilder.withRetryMiddleware(retryMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final RetryRequestMiddleware retryMiddleware) {
        return with(clientBuilder -> clientBuilder.withRetryMiddleware(retryMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final int maxRetries) {
        return with(clientBuilder -> clientBuilder
                .withPolicies(policies -> policies.withRetry(builder -> builder.maxRetries(maxRetries))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        return with(clientBuilder -> clientBuilder.withPolicies(
            policies -> policies.withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final int maxRetries, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder
                .withPolicies(policies -> policies.withRetry(builder -> builder.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withRetry(
            builder -> builder.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries) {
        return with(clientBuilder -> clientBuilder.withPolicies(
            policies -> policies.withScheduler(executorService).withRetry(builder -> builder.maxRetries(maxRetries))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures, final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(builder -> builder.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(
                    builder -> builder.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries) {
        return with(clientBuilder -> clientBuilder.withPolicies(
            policies -> policies.withScheduler(executorService).withRetry(builder -> builder.maxRetries(maxRetries))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures, final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(builder -> builder.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(executorService)
                .withRetry(
                    builder -> builder.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries) {
        return with(clientBuilder -> clientBuilder.withPolicies(
            policies -> policies.withScheduler(scheduler).withRetry(builder -> builder.maxRetries(maxRetries))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries,
            List<Integer> statusCodes) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries,
            List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(builder -> builder.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(builder -> builder.maxRetries(maxRetries)
                        .initialDelay(delay)
                        .maxDelay(maxDelay)
                        .statusCodes(statusCodes)
                        .failures(failures)
                        .options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withRetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return with(clientBuilder -> clientBuilder.withPolicies(policies -> policies.withScheduler(scheduler)
                .withRetry(
                    builder -> builder.maxRetries(maxRetries).initialDelay(delay).maxDelay(maxDelay).options(fn))));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withQueueMiddleware(final Supplier<QueueRequestMiddleware> queueMiddleware) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(queueMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withQueueMiddleware(final QueueRequestMiddleware queueMiddleware) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(queueMiddleware));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withQueueMiddleware(final int maxRequests, final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(maxRequests, maxWaitTime));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withQueueMiddleware(final Scheduler scheduler, final int maxRequests,
            final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(scheduler, maxRequests, maxWaitTime));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withQueueMiddleware(final ScheduledExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(executorService, maxRequests, maxWaitTime));
    }

    /**
     * @deprecated use {@link #withPolicies(Function)} instead
     */
    @Deprecated
    public ApiRootBuilder withQueueMiddleware(final ExecutorService executorService, final int maxRequests,
            final Duration maxWaitTime) {
        return with(clientBuilder -> clientBuilder.withQueueMiddleware(executorService, maxRequests, maxWaitTime));
    }

    public ApiRootBuilder withOAuthMiddleware(final Supplier<OAuthMiddleware> oAuthMiddleware) {
        return with(clientBuilder -> clientBuilder.withOAuthMiddleware(oAuthMiddleware));
    }

    public ApiRootBuilder withOAuthMiddleware(final OAuthMiddleware oAuthMiddleware) {
        return with(clientBuilder -> clientBuilder.withOAuthMiddleware(oAuthMiddleware));
    }

    public ApiRootBuilder withTokenSupplier(final TokenSupplier tokenSupplier) {
        return with(clientBuilder -> clientBuilder.withTokenSupplier(tokenSupplier));
    }

    public ApiRootBuilder withTokenSupplier(final Supplier<TokenSupplier> tokenSupplier) {
        return with(clientBuilder -> clientBuilder.withTokenSupplier(tokenSupplier));
    }

    public ApiRootBuilder withInternalLoggerMiddleware(final InternalLoggerMiddleware internalLoggerMiddleware) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerMiddleware(internalLoggerMiddleware));
    }

    public ApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerFactory(internalLoggerFactory));
    }

    public ApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent,
            deprecationLogEvent));
    }

    public ApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent,
            deprecationLogEvent, defaultExceptionLogEvent, exceptionLogEvents));
    }

    public ApiRootBuilder withInternalLoggerFactory(final InternalLoggerFactory internalLoggerFactory,
            final Level responseLogEvent, final Level deprecationLogEvent, final Level defaultExceptionLogEvent,
            final Map<Class<? extends Throwable>, Level> exceptionLogEvents,
            final ResponseLogFormatter responseLogFormatter, final ErrorLogFormatter errorLogFormatter) {
        return with(clientBuilder -> clientBuilder.withInternalLoggerFactory(internalLoggerFactory, responseLogEvent,
            deprecationLogEvent, defaultExceptionLogEvent, exceptionLogEvents, responseLogFormatter,
            errorLogFormatter));
    }

    public ApiRootBuilder withApiBaseUrl(String apiBaseUrl) {
        return with(clientBuilder -> clientBuilder.withApiBaseUrl(apiBaseUrl));
    }

    public ApiRootBuilder withApiBaseUrl(final URI apiBaseUrl) {
        return with(clientBuilder -> clientBuilder.withApiBaseUrl(apiBaseUrl));
    }

    public ApiRootBuilder withUserAgentSupplier(final Supplier<String> userAgentSupplier) {
        return with(clientBuilder -> clientBuilder.withUserAgentSupplier(userAgentSupplier));
    }

    public ApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider) {
        return addCorrelationIdProvider(correlationIdProvider, true);
    }

    private ApiRootBuilder addCorrelationIdProvider(final @Nullable CorrelationIdProvider correlationIdProvider,
            final boolean replace) {
        return with(clientBuilder -> clientBuilder.addCorrelationIdProvider(correlationIdProvider, replace));
    }

    public ApiRootBuilder withMiddleware(final Middleware middleware, final Middleware... middlewares) {
        return with(clientBuilder -> clientBuilder.withMiddleware(middleware, middlewares));
    }

    public ApiRootBuilder addMiddleware(final Middleware middleware, final Middleware... middlewares) {
        return with(clientBuilder -> clientBuilder.addMiddleware(middleware, middlewares));
    }

    public ApiRootBuilder withMiddlewares(final List<Middleware> middlewares) {
        return with(clientBuilder -> clientBuilder.withMiddlewares(middlewares));
    }

    public ApiRootBuilder addMiddlewares(final List<Middleware> middlewares) {
        return with(clientBuilder -> clientBuilder.addMiddlewares(middlewares));
    }

    public ApiRootBuilder with(UnaryOperator<ClientBuilder> builderUnaryOperator) {
        builderUnaryOperator.apply(builder);

        return this;
    }

    public ApiRoot build() {
        return ApiRoot.fromClient(clientSupplier().get());
    }

    public ApiHttpClient buildClient() {
        return clientSupplier().get();
    }

    public Supplier<ApiHttpClient> clientSupplier() {
        return builder::build;
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     * @param projectKey the project key to be used
     * @return Builder
     */
    @Deprecated
    public ByProjectKeyRequestBuilder buildForProject(final String projectKey) {
        addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey), false);
        return ApiRoot.fromClient(builder.build()).withProjectKey(projectKey);
    }

    public ProjectApiRoot buildProjectRoot() {
        Objects.requireNonNull(projectKey, PROJECT_KEY_MUST_BE_SET);
        addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey), false);
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    /**
     * @deprecated use {@link #build(String)}  instead
     * @param projectKey the project key to be used
     * @return Builder
     */
    @Deprecated
    public ProjectApiRoot buildProjectRoot(final String projectKey) {
        addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey), false);
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    public ProjectApiRoot build(final String projectKey) {
        addCorrelationIdProvider(new ApiCorrelationIdProvider(projectKey), false);
        return ProjectApiRoot.fromClient(projectKey, builder.build());
    }

    public static ByProjectKeyRequestBuilder createForProject(final String projectKey,
            final ApiHttpClient clientSupplier) {
        return ApiRoot.fromClient(clientSupplier).withProjectKey(projectKey);
    }
}
