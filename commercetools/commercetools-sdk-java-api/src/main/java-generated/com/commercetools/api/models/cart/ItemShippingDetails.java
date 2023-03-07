
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingDetails
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetails itemShippingDetails = ItemShippingDetails.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .valid(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsImpl.class)
public interface ItemShippingDetails {

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    /**
     *  <ul>
     *   <li><code>true</code> if the quantity of Line Items or Custom Line Items is equal to the sum of sub-quantities defined in <code>targets</code>.</li>
     *   <li><code>false</code> if the quantity of Line Items or Custom Line Items is not equal to the sum of sub-quantities defined in <code>targets</code>. Ordering a Cart when the value is <code>false</code> returns an InvalidItemShippingDetails error.</li>
     *  </ul>
     */
    @NotNull
    @JsonProperty("valid")
    public Boolean getValid();

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    public void setTargets(final List<ItemShippingTarget> targets);

    public void setValid(final Boolean valid);

    public static ItemShippingDetails of() {
        return new ItemShippingDetailsImpl();
    }

    public static ItemShippingDetails of(final ItemShippingDetails template) {
        ItemShippingDetailsImpl instance = new ItemShippingDetailsImpl();
        instance.setTargets(template.getTargets());
        instance.setValid(template.getValid());
        return instance;
    }

    public static ItemShippingDetailsBuilder builder() {
        return ItemShippingDetailsBuilder.of();
    }

    public static ItemShippingDetailsBuilder builder(final ItemShippingDetails template) {
        return ItemShippingDetailsBuilder.of(template);
    }

    default <T> T withItemShippingDetails(Function<ItemShippingDetails, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetails> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ItemShippingDetails>() {
            @Override
            public String toString() {
                return "TypeReference<ItemShippingDetails>";
            }
        };
    }
}
