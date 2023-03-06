
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String MATCHING_PRICE_NOT_FOUND = "MatchingPriceNotFound";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The variant $variantId of product $productId does not contain a price for currency $currencyCode, $country, $customerGroup, $channel."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of a Product.</p>
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>Unique identifier of a ProductVariant in the Product.</p>
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Currency code of the country.</p>
     */

    @JsonProperty("currency")
    public String getCurrency();

    /**
     *  <p>Country code of the geographic location.</p>
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Customer Group associated with the Price.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Channel associated with the Price.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();

    public void setMessage(final String message);

    public void setProductId(final String productId);

    public void setVariantId(final Integer variantId);

    public void setCurrency(final String currency);

    public void setCountry(final String country);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setChannel(final ChannelReference channel);

    public static MatchingPriceNotFoundError of() {
        return new MatchingPriceNotFoundErrorImpl();
    }

    public static MatchingPriceNotFoundError of(final MatchingPriceNotFoundError template) {
        MatchingPriceNotFoundErrorImpl instance = new MatchingPriceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        return instance;
    }

    public static MatchingPriceNotFoundErrorBuilder builder() {
        return MatchingPriceNotFoundErrorBuilder.of();
    }

    public static MatchingPriceNotFoundErrorBuilder builder(final MatchingPriceNotFoundError template) {
        return MatchingPriceNotFoundErrorBuilder.of(template);
    }

    default <T> T withMatchingPriceNotFoundError(Function<MatchingPriceNotFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MatchingPriceNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MatchingPriceNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<MatchingPriceNotFoundError>";
            }
        };
    }
}
