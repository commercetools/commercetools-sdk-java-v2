
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the parent of a Business Unit generates a BusinessUnitParentUnitChanged Message. The user must be an Associate with the <code>Admin</code> role in the new parent unit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeParentUnitAction myBusinessUnitChangeParentUnitAction = MyBusinessUnitChangeParentUnitAction.builder()
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitChangeParentUnitActionImpl.class)
public interface MyBusinessUnitChangeParentUnitAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitChangeParentUnitAction
     */
    String CHANGE_PARENT_UNIT = "changeParentUnit";

    /**
     *  <p>New parent unit of the Business Unit.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    /**
     *  <p>New parent unit of the Business Unit.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    /**
     * factory method
     * @return instance of MyBusinessUnitChangeParentUnitAction
     */
    public static MyBusinessUnitChangeParentUnitAction of() {
        return new MyBusinessUnitChangeParentUnitActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitChangeParentUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitChangeParentUnitAction of(final MyBusinessUnitChangeParentUnitAction template) {
        MyBusinessUnitChangeParentUnitActionImpl instance = new MyBusinessUnitChangeParentUnitActionImpl();
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitChangeParentUnitAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitChangeParentUnitAction deepCopy(
            @Nullable final MyBusinessUnitChangeParentUnitAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitChangeParentUnitActionImpl instance = new MyBusinessUnitChangeParentUnitActionImpl();
        instance.setParentUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getParentUnit()));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitChangeParentUnitAction
     * @return builder
     */
    public static MyBusinessUnitChangeParentUnitActionBuilder builder() {
        return MyBusinessUnitChangeParentUnitActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitChangeParentUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitChangeParentUnitActionBuilder builder(
            final MyBusinessUnitChangeParentUnitAction template) {
        return MyBusinessUnitChangeParentUnitActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitChangeParentUnitAction(Function<MyBusinessUnitChangeParentUnitAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeParentUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeParentUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeParentUnitAction>";
            }
        };
    }
}
