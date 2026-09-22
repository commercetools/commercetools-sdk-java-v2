
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentProductsNotFoundWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentProductsNotFoundWarning agentProductsNotFoundWarning = AgentProductsNotFoundWarning.builder()
 *             .message("{message}")
 *             .plusProducts(productsBuilder -> productsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentProductsNotFoundWarningBuilder implements Builder<AgentProductsNotFoundWarning> {

    private String message;

    private java.util.List<String> products;

    /**
     *  <p>Plain text description of the unmatched Products.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentProductsNotFoundWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @param products value to be set
     * @return Builder
     */

    public AgentProductsNotFoundWarningBuilder products(final String... products) {
        this.products = new ArrayList<>(Arrays.asList(products));
        return this;
    }

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @param products value to be set
     * @return Builder
     */

    public AgentProductsNotFoundWarningBuilder products(final java.util.List<String> products) {
        this.products = products;
        return this;
    }

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @param products value to be set
     * @return Builder
     */

    public AgentProductsNotFoundWarningBuilder plusProducts(final String... products) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.addAll(Arrays.asList(products));
        return this;
    }

    /**
     *  <p>Plain text description of the unmatched Products.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @return products
     */

    public java.util.List<String> getProducts() {
        return this.products;
    }

    /**
     * builds AgentProductsNotFoundWarning with checking for non-null required values
     * @return AgentProductsNotFoundWarning
     */
    public AgentProductsNotFoundWarning build() {
        Objects.requireNonNull(message, AgentProductsNotFoundWarning.class + ": message is missing");
        Objects.requireNonNull(products, AgentProductsNotFoundWarning.class + ": products is missing");
        return new AgentProductsNotFoundWarningImpl(message, products);
    }

    /**
     * builds AgentProductsNotFoundWarning without checking for non-null required values
     * @return AgentProductsNotFoundWarning
     */
    public AgentProductsNotFoundWarning buildUnchecked() {
        return new AgentProductsNotFoundWarningImpl(message, products);
    }

    /**
     * factory method for an instance of AgentProductsNotFoundWarningBuilder
     * @return builder
     */
    public static AgentProductsNotFoundWarningBuilder of() {
        return new AgentProductsNotFoundWarningBuilder();
    }

    /**
     * create builder for AgentProductsNotFoundWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentProductsNotFoundWarningBuilder of(final AgentProductsNotFoundWarning template) {
        AgentProductsNotFoundWarningBuilder builder = new AgentProductsNotFoundWarningBuilder();
        builder.message = template.getMessage();
        builder.products = template.getProducts();
        return builder;
    }

}
