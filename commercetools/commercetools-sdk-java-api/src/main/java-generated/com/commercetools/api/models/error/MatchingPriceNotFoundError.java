
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the Product Variant does not have a Price according to the Product <code>priceMode</code> value for a selected currency, country, Customer Group, or Channel.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Add LineItem, Add CustomLineItem, and Add DiscountCode update actions on Carts.</li>
 *   <li>Add LineItem, Add CustomLineItem, and Add DiscountCode update actions on Order Edits.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MatchingPriceNotFoundError matchingPriceNotFoundError = MatchingPriceNotFoundError.builder()
 *             .message("{message}")
 *             .productId("{productId}")
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MatchingPriceNotFoundErrorImpl.class)
public interface MatchingPriceNotFoundError extends ErrorObject {

    /**
     * discriminator value for MatchingPriceNotFoundError
     */
    String MATCHING_PRICE_NOT_FOUND = "MatchingPriceNotFound";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The variant $variantId of product $productId does not contain a price for currency $currencyCode, $country, $customerGroup, $channel."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of a Product.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Currency code of the country.</p>
     * @return currency
     */

    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Country code of the geographic location.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Channel associated with the Price.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    /**
     *  <p><code>"The variant $variantId of product $productId does not contain a price for currency $currencyCode, $country, $customerGroup, $channel."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of a Product.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>Currency code of the country.</p>
     * @param currency value to be set
     */

    public void setCurrency(final String currency);

    /**
     *  <p>Country code of the geographic location.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Customer Group associated with the Price.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Channel associated with the Price.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelReference channel);

    /**
     * factory method
     * @return instance of MatchingPriceNotFoundError
     */
    public static MatchingPriceNotFoundError of() {
        return new MatchingPriceNotFoundErrorImpl();
    }

    /**
     * factory method to create a shallow copy MatchingPriceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MatchingPriceNotFoundError of(final MatchingPriceNotFoundError template) {
        MatchingPriceNotFoundErrorImpl instance = new MatchingPriceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of MatchingPriceNotFoundError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MatchingPriceNotFoundError deepCopy(@Nullable final MatchingPriceNotFoundError template) {
        if (template == null) {
            return null;
        }
        MatchingPriceNotFoundErrorImpl instance = new MatchingPriceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getChannel()));
        return instance;
    }

    /**
     * builder factory method for MatchingPriceNotFoundError
     * @return builder
     */
    public static MatchingPriceNotFoundErrorBuilder builder() {
        return MatchingPriceNotFoundErrorBuilder.of();
    }

    /**
     * create builder for MatchingPriceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MatchingPriceNotFoundErrorBuilder builder(final MatchingPriceNotFoundError template) {
        return MatchingPriceNotFoundErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMatchingPriceNotFoundError(Function<MatchingPriceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MatchingPriceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MatchingPriceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<MatchingPriceNotFoundError>";
            }
        };
    }
}
