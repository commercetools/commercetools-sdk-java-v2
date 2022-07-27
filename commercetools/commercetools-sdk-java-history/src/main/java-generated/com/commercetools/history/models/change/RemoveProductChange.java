
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveProductChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveProductChange removeProductChange = RemoveProductChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveProductChangeImpl.class)
public interface RemoveProductChange extends Change {

    String REMOVE_PRODUCT_CHANGE = "RemoveProductChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for when a product is unassigned from a product selection</p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public static RemoveProductChange of() {
        return new RemoveProductChangeImpl();
    }

    public static RemoveProductChange of(final RemoveProductChange template) {
        RemoveProductChangeImpl instance = new RemoveProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveProductChangeBuilder builder() {
        return RemoveProductChangeBuilder.of();
    }

    public static RemoveProductChangeBuilder builder(final RemoveProductChange template) {
        return RemoveProductChangeBuilder.of(template);
    }

    default <T> T withRemoveProductChange(Function<RemoveProductChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveProductChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveProductChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveProductChange>";
            }
        };
    }
}
