
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the name on a Business Unit generates a BusinessUnitNameChanged Message.</p>
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
     * factory method to copy an instance of MyBusinessUnitChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitChangeNameAction of(final MyBusinessUnitChangeNameAction template) {
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
