
package com.commercetools.docs.meta;

/**
 * <h2>Installation</h2>
 *
 * <h3>Modules</h3>
 *
 * <p>For each of our APIs there is a separate module with all type and request classes.</p>
 *
 * <dl>
 *     <dt>commercetools-sdk-java-api</dt>
 *     <dd>models and request builders for the product API</dd>
 *     <dt>commercetools-sdk-java-importapi</dt>
 *     <dd>models and request builders for the import API</dd>
 *     <dt>commercetools-sdk-java-ml</dt>
 *     <dd>models and request builders for the machine learning API</dd>
 *     <dt>commercetools-sdk-java-history</dt>
 *     <dd>models and request builders for the audit API</dd>
 * </dl>
 *
 * <p>The SDK provides three HTTP client modules and one default module which serves as alias.</p>
 * <dl>
 *     <dt>commercetools-okhttp-client4</dt>
 *     <dd>uses OkHttp client 4.0</dd>
 *     <dt>commercetools-okhttp-client3</dt>
 *     <dd>uses OkHttp client 3.0</dd>
 *     <dt>commercetools-apachehttp-client</dt>
 *     <dd>uses Apache HTTP async client 5.1</dd>
 *     <dt>commercetools-http-client</dt>
 *     <dd>alias for commercetools-okhttp-client4</dd>
 * </dl>
 *
 * <p>The module <code>rmf-java-base</code> provides the base classes and common abstractions like {@link io.vrap.rmf.base.client.ApiHttpClient},
 * {@link io.vrap.rmf.base.client.http.Middleware} etc.</p>
 *
 * All modules are published to Maven Central.
 *
 * <h3>Gradle</h3>
 *
 * <pre>{@code
 * ext {
 *     versions = [
 *         commercetools: "<latest version>"
 *     ]
 * }
 *
 * repositories {
 *     mavenCentral()
 * }
 *
 * dependencies {
 *     implementation "com.commercetools.sdk:commercetools-http-client:${versions.commercetools}"
 *     implementation "com.commercetools.sdk:commercetools-sdk-java-api:${versions.commercetools}"
 *     implementation "com.commercetools.sdk:commercetools-sdk-java-importapi:${versions.commercetools}"
 *     implementation "com.commercetools.sdk:commercetools-sdk-java-ml:${versions.commercetools}"
 * }
 * }</pre>
 *
 * <h3>Maven</h3>
 *
 * <pre>{@code
 * <properties>
 *     <commercetools.version><!-- latest version --></commercetools.version>
 * </properties>
 * <dependencies>
 *     <dependency>
 *       <groupId>com.commercetools.sdk</groupId>
 *       <artifactId>commercetools-http-client</artifactId>
 *       <version>${commercetools.version}</version>
 *     </dependency>
 *     <dependency>
 *       <groupId>com.commercetools.sdk</groupId>
 *       <artifactId>commercetools-sdk-java-api</artifactId>
 *       <version>${commercetools.version}</version>
 *     </dependency>
 *     <dependency>
 *       <groupId>com.commercetools.sdk</groupId>
 *       <artifactId>commercetools-sdk-java-importapi</artifactId>
 *       <version>${commercetools.version}</version>
 *     </dependency>
 *     <dependency>
 *       <groupId>com.commercetools.sdk</groupId>
 *       <artifactId>commercetools-sdk-java-ml</artifactId>
 *       <version>${commercetools.version}</version>
 *     </dependency>
 * </dependencies>
 * }</pre>
 *
 * <h3>Troubleshooting</h3>
 *
 * <h4>Spring Framework</h4>
 *
 * <p>The Spring Framework has an optional dependency to OkHttp in version 3.x. To avoid problems use the <code>commercetools-okhttp-client3</code>
 * or <code>commercetools-apachehttp-client</code> module instead of the module <code>commercetools-http-client</code></p>
 */
public class Installation {
}
