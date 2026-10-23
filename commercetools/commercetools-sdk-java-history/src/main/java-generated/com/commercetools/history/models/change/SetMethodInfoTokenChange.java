
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoTokenAction" rel="nofollow">Set MethodInfoToken</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoTokenChange setMethodInfoTokenChange = SetMethodInfoTokenChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMethodInfoTokenChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoTokenChangeImpl.class)
public interface SetMethodInfoTokenChange extends Change {

    /**
     * discriminator value for SetMethodInfoTokenChange
     */
    String SET_METHOD_INFO_TOKEN_CHANGE = "SetMethodInfoTokenChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * factory method
     * @return instance of SetMethodInfoTokenChange
     */
    public static SetMethodInfoTokenChange of() {
        return new SetMethodInfoTokenChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMethodInfoTokenChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoTokenChange of(final SetMethodInfoTokenChange template) {
        SetMethodInfoTokenChangeImpl instance = new SetMethodInfoTokenChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public SetMethodInfoTokenChange copyDeep();

    /**
     * factory method to create a deep copy of SetMethodInfoTokenChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMethodInfoTokenChange deepCopy(@Nullable final SetMethodInfoTokenChange template) {
        if (template == null) {
            return null;
        }
        SetMethodInfoTokenChangeImpl instance = new SetMethodInfoTokenChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoTokenChange
     * @return builder
     */
    public static SetMethodInfoTokenChangeBuilder builder() {
        return SetMethodInfoTokenChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoTokenChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoTokenChangeBuilder builder(final SetMethodInfoTokenChange template) {
        return SetMethodInfoTokenChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoTokenChange(Function<SetMethodInfoTokenChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<SetMethodInfoTokenChange> typeReference() {
        return new tools.jackson.core.type.TypeReference<SetMethodInfoTokenChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoTokenChange>";
            }
        };
    }
}
