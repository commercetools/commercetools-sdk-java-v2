
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.DiscountCodeKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountCodeInfo
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeInfo discountCodeInfo = DiscountCodeInfo.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeInfoImpl.class)
public interface DiscountCodeInfo {

    /**
     *  <p>References a DiscountCode by key. If the referenced DiscountCode does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced DiscountCode is created.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeKeyReference getDiscountCode();

    /**
     *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
     * @return state
     */

    @JsonProperty("state")
    public DiscountCodeState getState();

    /**
     *  <p>References a DiscountCode by key. If the referenced DiscountCode does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced DiscountCode is created.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeKeyReference discountCode);

    /**
     *  <p>Maps to <code>DiscountCodeInfo.state</code></p>
     * @param state value to be set
     */

    public void setState(final DiscountCodeState state);

    /**
     * factory method
     * @return instance of DiscountCodeInfo
     */
    public static DiscountCodeInfo of() {
        return new DiscountCodeInfoImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeInfo of(final DiscountCodeInfo template) {
        DiscountCodeInfoImpl instance = new DiscountCodeInfoImpl();
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        return instance;
    }

    public DiscountCodeInfo copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeInfo deepCopy(@Nullable final DiscountCodeInfo template) {
        if (template == null) {
            return null;
        }
        DiscountCodeInfoImpl instance = new DiscountCodeInfoImpl();
        instance.setDiscountCode(
            com.commercetools.importapi.models.common.DiscountCodeKeyReference.deepCopy(template.getDiscountCode()));
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeInfo
     * @return builder
     */
    public static DiscountCodeInfoBuilder builder() {
        return DiscountCodeInfoBuilder.of();
    }

    /**
     * create builder for DiscountCodeInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeInfoBuilder builder(final DiscountCodeInfo template) {
        return DiscountCodeInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeInfo(Function<DiscountCodeInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeInfo>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeInfo>";
            }
        };
    }
}
