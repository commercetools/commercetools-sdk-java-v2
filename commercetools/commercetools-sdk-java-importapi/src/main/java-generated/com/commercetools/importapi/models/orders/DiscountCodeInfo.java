
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.DiscountCodeKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeInfoImpl.class)
public interface DiscountCodeInfo {

    /**
    *  <p>References a discount code by key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeKeyReference getDiscountCode();

    /**
    *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
    */

    @JsonProperty("state")
    public DiscountCodeState getState();

    public void setDiscountCode(final DiscountCodeKeyReference discountCode);

    public void setState(final DiscountCodeState state);

    public static DiscountCodeInfo of() {
        return new DiscountCodeInfoImpl();
    }

    public static DiscountCodeInfo of(final DiscountCodeInfo template) {
        DiscountCodeInfoImpl instance = new DiscountCodeInfoImpl();
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        return instance;
    }

    public static DiscountCodeInfoBuilder builder() {
        return DiscountCodeInfoBuilder.of();
    }

    public static DiscountCodeInfoBuilder builder(final DiscountCodeInfo template) {
        return DiscountCodeInfoBuilder.of(template);
    }

    default <T> T withDiscountCodeInfo(Function<DiscountCodeInfo, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeInfo>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeInfo>";
            }
        };
    }
}
