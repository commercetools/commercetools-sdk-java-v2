
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartUpdate myCartUpdate = MyCartUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartUpdateImpl.class)
public interface MyCartUpdate
        extends com.commercetools.api.models.ResourceUpdate<MyCartUpdate, MyCartUpdateAction, MyCartUpdateBuilder> {

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyCartUpdateAction> getActions();

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final MyCartUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions values to be set
     */

    public void setActions(final List<MyCartUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyCartUpdate
     */
    public static MyCartUpdate of() {
        return new MyCartUpdateImpl();
    }

    /**
     * factory method to create a shallow copy MyCartUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartUpdate of(final MyCartUpdate template) {
        MyCartUpdateImpl instance = new MyCartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartUpdate deepCopy(@Nullable final MyCartUpdate template) {
        if (template == null) {
            return null;
        }
        MyCartUpdateImpl instance = new MyCartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyCartUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCartUpdate
     * @return builder
     */
    public static MyCartUpdateBuilder builder() {
        return MyCartUpdateBuilder.of();
    }

    /**
     * create builder for MyCartUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartUpdateBuilder builder(final MyCartUpdate template) {
        return MyCartUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartUpdate(Function<MyCartUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartUpdate>";
            }
        };
    }
}
