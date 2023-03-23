
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String CHANGE_PARENT_UNIT = "changeParentUnit";

    /**
     *  <p>New parent unit of the Business Unit.</p>
     * @return parentUnit
     */
    @NotNull
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitResourceIdentifier getParentUnit();

    public void setParentUnit(final BusinessUnitResourceIdentifier parentUnit);

    public static MyBusinessUnitChangeParentUnitAction of() {
        return new MyBusinessUnitChangeParentUnitActionImpl();
    }

    public static MyBusinessUnitChangeParentUnitAction of(final MyBusinessUnitChangeParentUnitAction template) {
        MyBusinessUnitChangeParentUnitActionImpl instance = new MyBusinessUnitChangeParentUnitActionImpl();
        instance.setParentUnit(template.getParentUnit());
        return instance;
    }

    public static MyBusinessUnitChangeParentUnitActionBuilder builder() {
        return MyBusinessUnitChangeParentUnitActionBuilder.of();
    }

    public static MyBusinessUnitChangeParentUnitActionBuilder builder(
            final MyBusinessUnitChangeParentUnitAction template) {
        return MyBusinessUnitChangeParentUnitActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitChangeParentUnitAction(Function<MyBusinessUnitChangeParentUnitAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeParentUnitAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeParentUnitAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeParentUnitAction>";
            }
        };
    }
}
