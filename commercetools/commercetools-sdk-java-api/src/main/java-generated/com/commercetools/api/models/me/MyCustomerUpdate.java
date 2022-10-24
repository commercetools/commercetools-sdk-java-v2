
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerUpdate myCustomerUpdate = MyCustomerUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerUpdateImpl.class)
public interface MyCustomerUpdate extends
        com.commercetools.api.models.ResourceUpdate<MyCustomerUpdate, MyCustomerUpdateAction, MyCustomerUpdateBuilder> {

    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyCustomerUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final MyCustomerUpdateAction... actions);

    public void setActions(final List<MyCustomerUpdateAction> actions);

    public static MyCustomerUpdate of() {
        return new MyCustomerUpdateImpl();
    }

    public static MyCustomerUpdate of(final MyCustomerUpdate template) {
        MyCustomerUpdateImpl instance = new MyCustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyCustomerUpdateBuilder builder() {
        return MyCustomerUpdateBuilder.of();
    }

    public static MyCustomerUpdateBuilder builder(final MyCustomerUpdate template) {
        return MyCustomerUpdateBuilder.of(template);
    }

    default <T> T withMyCustomerUpdate(Function<MyCustomerUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerUpdate>";
            }
        };
    }
}
