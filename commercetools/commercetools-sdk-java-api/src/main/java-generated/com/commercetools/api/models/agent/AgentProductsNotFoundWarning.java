
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.warning.WarningObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when one or more Products referenced in an Intake Agent <span>API request</span> could not be matched to the catalog. The unmatched Products are omitted from the created entity.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("ProductsNotFound")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AgentProductsNotFoundWarningImpl.class)
public interface AgentProductsNotFoundWarning extends WarningObject {

    /**
     * discriminator value for AgentProductsNotFoundWarning
     */
    String PRODUCTS_NOT_FOUND = "ProductsNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the unmatched Products.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @return products
     */
    @NotNull
    @JsonProperty("products")
    public List<String> getProducts();

    /**
     *  <p>Plain text description of the unmatched Products.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @param products values to be set
     */

    @JsonIgnore
    public void setProducts(final String... products);

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     * @param products values to be set
     */

    public void setProducts(final List<String> products);

    /**
     * factory method
     * @return instance of AgentProductsNotFoundWarning
     */
    public static AgentProductsNotFoundWarning of() {
        return new AgentProductsNotFoundWarningImpl();
    }

    /**
     * factory method to create a shallow copy AgentProductsNotFoundWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static AgentProductsNotFoundWarning of(final AgentProductsNotFoundWarning template) {
        AgentProductsNotFoundWarningImpl instance = new AgentProductsNotFoundWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setProducts(template.getProducts());
        return instance;
    }

    public AgentProductsNotFoundWarning copyDeep();

    /**
     * factory method to create a deep copy of AgentProductsNotFoundWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AgentProductsNotFoundWarning deepCopy(@Nullable final AgentProductsNotFoundWarning template) {
        if (template == null) {
            return null;
        }
        AgentProductsNotFoundWarningImpl instance = new AgentProductsNotFoundWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setProducts(Optional.ofNullable(template.getProducts()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for AgentProductsNotFoundWarning
     * @return builder
     */
    public static AgentProductsNotFoundWarningBuilder builder() {
        return AgentProductsNotFoundWarningBuilder.of();
    }

    /**
     * create builder for AgentProductsNotFoundWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentProductsNotFoundWarningBuilder builder(final AgentProductsNotFoundWarning template) {
        return AgentProductsNotFoundWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAgentProductsNotFoundWarning(Function<AgentProductsNotFoundWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<AgentProductsNotFoundWarning> typeReference() {
        return new tools.jackson.core.type.TypeReference<AgentProductsNotFoundWarning>() {
            @Override
            public String toString() {
                return "TypeReference<AgentProductsNotFoundWarning>";
            }
        };
    }
}
