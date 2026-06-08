
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updating the name on a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitNameChangedMessage" rel="nofollow">BusinessUnitNameChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeNameAction myBusinessUnitChangeNameAction = MyBusinessUnitChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitChangeNameActionImpl.class)
public interface MyBusinessUnitChangeNameAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New name to set.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New name to set.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of MyBusinessUnitChangeNameAction
     */
    public static MyBusinessUnitChangeNameAction of() {
        return new MyBusinessUnitChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitChangeNameAction of(final MyBusinessUnitChangeNameAction template) {
        MyBusinessUnitChangeNameActionImpl instance = new MyBusinessUnitChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public MyBusinessUnitChangeNameAction copyDeep();

    /**
     * factory method to create a deep copy of MyBusinessUnitChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitChangeNameAction deepCopy(@Nullable final MyBusinessUnitChangeNameAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitChangeNameActionImpl instance = new MyBusinessUnitChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitChangeNameAction
     * @return builder
     */
    public static MyBusinessUnitChangeNameActionBuilder builder() {
        return MyBusinessUnitChangeNameActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitChangeNameActionBuilder builder(final MyBusinessUnitChangeNameAction template) {
        return MyBusinessUnitChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitChangeNameAction(Function<MyBusinessUnitChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeNameAction>";
            }
        };
    }
}
