
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemDistributionChannelAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemDistributionChannelAction cartSetLineItemDistributionChannelAction = CartSetLineItemDistributionChannelAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemDistributionChannelActionImpl.class)
public interface CartSetLineItemDistributionChannelAction extends CartUpdateAction {

    String SET_LINE_ITEM_DISTRIBUTION_CHANNEL = "setLineItemDistributionChannel";

    /**
     <>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     <*  <p>ResourceIdentifier to a Channel.</p>>
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setLineItemId(final String lineItemId);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static CartSetLineItemDistributionChannelAction of() {
        return new CartSetLineItemDistributionChannelActionImpl();
    }

    public static CartSetLineItemDistributionChannelAction of(final CartSetLineItemDistributionChannelAction template) {
        CartSetLineItemDistributionChannelActionImpl instance = new CartSetLineItemDistributionChannelActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static CartSetLineItemDistributionChannelActionBuilder builder() {
        return CartSetLineItemDistributionChannelActionBuilder.of();
    }

    public static CartSetLineItemDistributionChannelActionBuilder builder(
            final CartSetLineItemDistributionChannelAction template) {
        return CartSetLineItemDistributionChannelActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemDistributionChannelAction(
            Function<CartSetLineItemDistributionChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemDistributionChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemDistributionChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemDistributionChannelAction>";
            }
        };
    }
}
