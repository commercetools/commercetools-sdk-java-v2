
package com.commercetools.docs.meta;

/**
 * <h2 id=logging>Logging</h2>
 *
 * <p>Internal logging used by the commercetools client itself. Uses slf4j logger named {@code commercetools}.</p>
 *
 * <h2 id=log-information>Log Information</h2>
 *
 * The default logger middleware logs following information per level:
 *
 * <h3>Error</h3>
 *
 * In case of an {@link io.vrap.rmf.base.client.ApiHttpException} the requests HTTP method name, URI and response status code
 * will be logged. For any other exception happening the cause and the exception will be logged.
 *
 * <h3>Info</h3>
 *
 * By default any response by the API will be logged with the requests HTTP method name, URI and response status code.
 * In case a deprecation header was submitted in the response an info entry with the deprecation notice will be logged.
 *
 * The used log level for these events can be configured while instantiating the InternalLoggerMiddleware.
 *
 * <h3>Debug</h3>
 *
 * The request and the response object will be logged as a string representation including headers and body. Sensitive
 * data like auth token and passwords will be redacted.
 *
 * <h3>Trace</h3>
 *
 * The request and response will be logged with a pretty printed output.  Sensitive data like auth token and passwords
 * will be redacted.
 *
 * <h2 id=logger-hierarchy>Logger hierarchy</h2>
 *
 * <p>The loggers form a hierarchy separated by a dot. The root logger is {@code commercetools}.</p>
 *
 * <p>The child loggers of commercetools are the endpoints, so for example {@code commercetools.categories} for categories and {@code commercetools.product-types} for product types.</p>
 *
 * <p>The grandchild loggers refer to the action. {@code commercetools.categories.request} refers to performing requests per HTTPS to commercetools for categories, {@code commercetools.categories.response} refers to the responses of the platform.</p>
 *
 * <p>The logger makes use of different log levels, so for example {@code commercetools.categories.response} logs on debug level the http response from the platform (abbreviated example):</p>
 *
 * <pre>{@code
 * [OkHttp https://api.europe-west1.gcp.commercetools.com/...] DEBUG commercetools.categories.response - io.vrap.rmf.base.client.ApiHttpResponse@33e37acd[statusCode=200,headers=...,textInterpretedBody={"limit":20,"offset":0,"count":4,"total":4,"results":[{"id":"ca7f64dc-ab41-4e7f-b65b-bfc25bf01111","version":1,"createdAt":"2021-01-06T09:21:55.445Z","lastModifiedAt":"2021-01-06T09:21:55.445Z","key":"random-key-15aab6ee-9a48-4fdc-a8c3-8ff9ff390d60","name":{"key-6bc3cc62-1995-43f4":"value-random-string-c3ff7f1a-6371-4c0c-a3b9-5060eca08b8a"},"slug":{"key-6bc3cc62-1995-43f4":"value-random-string-c3ff7f1a-6371-4c0c-a3b9-5060eca08b8a"},"description":{"key-6bc3cc62-1995-43f4":"value-random-string-c3ff7f1a-6371-4c0c-a3b9-5060eca08b8a"},"ancestors":[],"orderHint":"random-string-a99e6941-3225-4766-923a-4a654652532f","externalId":"random-id-100b3851-29b4-47c1-aef3-860b4cd28f54"}]}]
 * }</pre>
 *
 * <p>{@code commercetools.categories.response} logs on trace level additional the formatted http response from the platform (abbreviated example):</p>
 *
 * <pre>{@code
 * [OkHttp https://api.europe-west1.gcp.commercetools.com/...] TRACE commercetools.categories.response - 200
 * {
 *   "limit" : 20,
 *   "offset" : 0,
 *   "count" : 4,
 *   "total" : 4,
 *   "results" : [ {
 *     "id" : "bcb15128-b69e-47b6-81c4-1ea5f9a63b83",
 *     "version" : 1,
 *     "lastMessageSequenceNumber" : 1,
 *     "createdAt" : "2021-01-06T09:21:50.485Z",
 *     "lastModifiedAt" : "2021-01-06T09:21:50.485Z",
 *     "createdBy" : {
 *       "clientId" : "h-QvaF3NpsjPBWeXa6TUOnq0",
 *       "isPlatformClient" : false
 *     },
 *     "key" : "random-key-f45535f5-1111-4bfb-98ac-164234ac2c73",
 *     "name" : {
 *       "key-b7d87008-9526-47b3-8b80" : "value-random-string-baf1a1ae-3726-4573-bec5-2c53c7d1114a"
 *     },
 *     "slug" : {
 *       "key-b7d87008-9526-47b3-8b80" : "value-random-string-baf1a1ae-3726-4573-bec5-2c53c7d1114a"
 *     },
 *     "description" : {
 *       "key-b7d87008-9526-47b3-8b80" : "value-random-string-baf1a1ae-3726-4573-bec5-2c53c7d1114a"
 *     },
 *     "ancestors" : [ ],
 *     "orderHint" : "random-string-6b88f299-d4ca-491a-9d7c-3463e718c8d2",
 *     "externalId" : "random-id-b98a5ab4-5413-40b3-8119-eb5ac2b5afbb",
 *     "metaTitle" : {
 *       "key-b7d87008-9526-47b3-8b80" : "value-random-string-baf1a1ae-3726-4573-bec5-2c53c7d1114a"
 *     },
 *     "metaKeywords" : {
 *       "key-b7d87008-9526-47b3-8b80" : "value-random-string-baf1a1ae-3726-4573-bec5-2c53c7d1114a"
 *     },
 *     "metaDescription" : {
 *       "key-b7d87008-9526-47b3-8b80" : "value-random-string-baf1a1ae-3726-4573-bec5-2c53c7d1114a"
 *     }
 *   }, {
 *   ...
 *   } ]
 * }
 * }</pre>
 *
 * <p>{@code commercetools.products.responses.queries} logs only HTTP GET requests and {@code commercetools.products.responses.commands} logs only HTTP POST/DELETE requests.</p>
 *
 * <pre>{@code
 * [pool-1-thread-1] DEBUG commercetools.products.request.commands - io.vrap.rmf.base.client.ApiHttpRequest@1d2c6948[method=POST,uri="https://api.europe-west1.gcp.commercetools.com/test-php-dev-integration-1/products",headers=[...],textInterpretedBody={"productType":{"id":"cda39953-23af-4e85-abb0-5b89517ec5f2","typeId":"product-type"},"name":{"random-string-b66de021-d2fa-4262-8837-94a6992a8cdc":"random-string-da28a010-e66b-49d4-a18b-f1bfc145d2f6"},...}]
 * [pool-1-thread-1] DEBUG commercetools.products.request.queries - io.vrap.rmf.base.client.ApiHttpRequest@53667fdb[method=GET,uri="https://api.europe-west1.gcp.commercetools.com/test-php-dev-integration-1/products/ef745227-b115-4132-ba2c-4e46db80df79",headers=[...],textInterpretedBody=empty body]
 * }</pre>
 */
public class Logging {
}
