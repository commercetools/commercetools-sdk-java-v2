
package com.commercetools.docs.meta;

/**
 * The exception hierarchy documentation.
 *
 * <h2>Exceptions</h2>
 *
 * The SDK makes use of exceptions from the Java JDK, such as {@link java.lang.IllegalArgumentException}, and provides own exceptions which all inherit from {@link io.vrap.rmf.base.client.error.BaseException}.
 *
 * <p>Problems concerning the {@link io.vrap.rmf.base.client.ApiHttpClient} throw a {@link io.vrap.rmf.base.client.ApiHttpException}.</p>
 *
 * <p>JSON serializing and deserializing problems throw {@link io.vrap.rmf.base.client.utils.json.JsonException}.</p>
 *
 * <p>{@link io.vrap.rmf.base.client.ApiHttpException} is a base exception for all error responses from the commercetools Composable Commerce (HTTP status code {@code >= 400}).</p>
 *
 * <p>{@link io.vrap.rmf.base.client.error.ApiClientException} expresses errors which can be recovered by the client side (HTTP status code {@code >= 400 and < 500}).
 * {@link io.vrap.rmf.base.client.error.ApiServerException} is for server errors.</p>
 *
 * <img src="{@docRoot}/io/vrap/rmf/base/client/error/exceptionhierarchy.svg" alt="Exception hierarchy" width="95%">
 *
 * <h3>Errors</h3>
 *
 * If a command cannot be performed due to unfulfilled preconditions
 * the platform can return one error response with multiple errors (<a href="https://docs.commercetools.com/api/errors">listing of error codes</a>).
 * The SDK will then put a {@link io.vrap.rmf.base.client.error.BadRequestException} into a {@link java.util.concurrent.CompletionStage}.
 *
 * <h3>Custom HttpExceptionFactory</h3>
 *
 * <p>In case a response with a status code of 400 or higher are treated as errors and raise exceptions. These exceptions
 * are created by the {@link io.vrap.rmf.base.client.error.DefaultHttpExceptionFactory}. In case you want to override the handling you have to implement
 * this interface and override the default methods if necessary.</p>
 *
 * {@include.example example.HttpExceptionFactoryTest}
 */
public class ExceptionDocumentation {
}
