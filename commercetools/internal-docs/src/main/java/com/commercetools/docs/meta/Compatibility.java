
package com.commercetools.docs.meta;

/**
 * <h2>Compatibility layer for JVM SDK</h2>
 *
 * <p>The module <code>commercetools-sdk-compat-v1</code> allows the usage of the SDK in conjunction with the JVM SDK (v1)</p>
 *
 * <h3>Using Requests from the JVM SDK (v1)</h3>
 *
 * <p>The {@link com.commercetools.compat.CompatClient} can be used to execute a {@link io.sphere.sdk.client.SphereRequest}
 * with an {@link io.vrap.rmf.base.client.ApiHttpClient}</p>
 *
 * {@include.example com.commercetools.compat.CompatClientUsageTest}
 *
 * <h3>Creating a SphereClient with the v2 SDK</h3>
 *
 * <p>The {@link com.commercetools.compat.CompatSphereClient} acts as a replacement {@link io.sphere.sdk.client.SphereClient} for applications using the JVM SDK (v1).</p>
 *
 * {@include.example com.commercetools.compat.CompatSphereClientUsageTest}
 */
public class Compatibility {
}
