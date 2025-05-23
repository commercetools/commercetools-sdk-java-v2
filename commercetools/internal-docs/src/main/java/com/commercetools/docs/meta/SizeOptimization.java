
package com.commercetools.docs.meta;

/**
 * {@include.toc}
 * <h2>Optimizing package size</h2>
 *
 * <p>Optimizing the size of applications in a size constrained environment like AWS Lambda can
 * be challenging.</p>
 *
 * <h3>Using split packages</h3>
 *
 * <p>For an application which covers the whole business logic and may act as a backend
 * for frontend it's advised to use the <code>commercetools-sdk-java-api</code> package.</p>
 *
 * <p>When developing small function applications which will be used in a size constrained environment
 * the SDK offers packages split by their domain. Due to the connections between the different domains
 * the split is realized after compilation and doesn't reflect the whole dependency graph of all packages.
 * You will have to explicitly define the packages you intend to use.</p>
 *
 * <p>We provide an {@see <a href=https://github.com/commercetools/commercetools-sdk-java-v2/tree/main/examples/split-packages>example</a>} for using split packages</p>
 *
 * <p>Please see the list for the split packages and their artifact IDs</p>
 *
 * <p><dl>
 *     <dt>Base</dt>
 *     <dd>com.commercetools.sdk:commercetools-sdk-java-api-base</dd>
 *     <dt>Models Base</dt>
 *     <dd>com.commercetools.sdk:commercetools-sdk-java-api-models-base</dd>
 *     <dt>Models by domain</dt>
 *     <dd>com.commercetools.sdk:commercetools-sdk-java-api-models-{domain}</dd>
 *     <dt>Predicates</dt>
 *     <dd>com.commercetools.sdk:commercetools-sdk-java-api-predicates</dd>
 * </dl></p>
 */
public class SizeOptimization {
}
