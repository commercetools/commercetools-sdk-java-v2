
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

    String CHANGE_NAME = "changeName";

    /**
     *  <p>New name to set.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static MyBusinessUnitChangeNameAction of() {
        return new MyBusinessUnitChangeNameActionImpl();
    }

    public static MyBusinessUnitChangeNameAction of(final MyBusinessUnitChangeNameAction template) {
        MyBusinessUnitChangeNameActionImpl instance = new MyBusinessUnitChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static MyBusinessUnitChangeNameActionBuilder builder() {
        return MyBusinessUnitChangeNameActionBuilder.of();
    }

    public static MyBusinessUnitChangeNameActionBuilder builder(final MyBusinessUnitChangeNameAction template) {
        return MyBusinessUnitChangeNameActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitChangeNameAction(Function<MyBusinessUnitChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeNameAction>";
            }
        };
    }
}
