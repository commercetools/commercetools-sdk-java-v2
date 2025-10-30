
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitRemoveAssociateAction" rel="nofollow">Remove Associate</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAssociateChange removeAssociateChange = RemoveAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemoveAssociateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveAssociateChangeImpl.class)
@Deprecated
public interface RemoveAssociateChange extends Change {

    /**
     * discriminator value for RemoveAssociateChange
     */
    String REMOVE_ASSOCIATE_CHANGE = "RemoveAssociateChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Associate getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Associate previousValue);

    /**
     * factory method
     * @return instance of RemoveAssociateChange
     */
    public static RemoveAssociateChange of() {
        return new RemoveAssociateChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveAssociateChange of(final RemoveAssociateChange template) {
        RemoveAssociateChangeImpl instance = new RemoveAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public RemoveAssociateChange copyDeep();

    /**
     * factory method to create a deep copy of RemoveAssociateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveAssociateChange deepCopy(@Nullable final RemoveAssociateChange template) {
        if (template == null) {
            return null;
        }
        RemoveAssociateChangeImpl instance = new RemoveAssociateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Associate.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveAssociateChange
     * @return builder
     */
    public static RemoveAssociateChangeBuilder builder() {
        return RemoveAssociateChangeBuilder.of();
    }

    /**
     * create builder for RemoveAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAssociateChangeBuilder builder(final RemoveAssociateChange template) {
        return RemoveAssociateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveAssociateChange(Function<RemoveAssociateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveAssociateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveAssociateChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveAssociateChange>";
            }
        };
    }
}
