
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
 * AddProductChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddProductChange addProductChange = AddProductChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddProductChangeImpl.class)
public interface AddProductChange extends Change {

    String ADD_PRODUCT_CHANGE = "AddProductChange";

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for when a product is assigned to a product selection</p>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setNextValue(final Reference nextValue);

    public static AddProductChange of() {
        return new AddProductChangeImpl();
    }

    public static AddProductChange of(final AddProductChange template) {
        AddProductChangeImpl instance = new AddProductChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddProductChangeBuilder builder() {
        return AddProductChangeBuilder.of();
    }

    public static AddProductChangeBuilder builder(final AddProductChange template) {
        return AddProductChangeBuilder.of(template);
    }

    default <T> T withAddProductChange(Function<AddProductChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddProductChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddProductChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddProductChange>";
            }
        };
    }
}
