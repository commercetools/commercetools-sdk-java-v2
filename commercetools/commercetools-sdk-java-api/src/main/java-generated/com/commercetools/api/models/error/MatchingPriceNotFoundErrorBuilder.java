
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MatchingPriceNotFoundErrorBuilder implements Builder<MatchingPriceNotFoundError> {

    private String message;

    private String productId;

    private Integer variantId;

    @Nullable
    private String currency;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference channel;

    public MatchingPriceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public MatchingPriceNotFoundErrorBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    public MatchingPriceNotFoundErrorBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public MatchingPriceNotFoundErrorBuilder currency(@Nullable final String currency) {
        this.currency = currency;
        return this;
    }

    public MatchingPriceNotFoundErrorBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public MatchingPriceNotFoundErrorBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public MatchingPriceNotFoundErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference channel) {
        this.channel = channel;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public String getProductId() {
        return this.productId;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getCurrency() {
        return this.currency;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getChannel() {
        return this.channel;
    }

    public MatchingPriceNotFoundError build() {
        Objects.requireNonNull(message);
        Objects.requireNonNull(productId);
        Objects.requireNonNull(variantId);
        return new MatchingPriceNotFoundErrorImpl(message, productId, variantId, currency, country, customerGroup,
            channel);
    }

    /**
     * builds MatchingPriceNotFoundError without checking for non null required values
     */
    public MatchingPriceNotFoundError buildUnchecked() {
        return new MatchingPriceNotFoundErrorImpl(message, productId, variantId, currency, country, customerGroup,
            channel);
    }

    public static MatchingPriceNotFoundErrorBuilder of() {
        return new MatchingPriceNotFoundErrorBuilder();
    }

    public static MatchingPriceNotFoundErrorBuilder of(final MatchingPriceNotFoundError template) {
        MatchingPriceNotFoundErrorBuilder builder = new MatchingPriceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.currency = template.getCurrency();
        builder.country = template.getCountry();
        builder.customerGroup = template.getCustomerGroup();
        builder.channel = template.getChannel();
        return builder;
    }

}
