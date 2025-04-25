
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * MyBusinessUnitUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitUpdate myBusinessUnitUpdate = MyBusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitUpdateImpl.class)
public interface MyBusinessUnitUpdate {

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyBusinessUnitUpdateAction> getActions();

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final MyBusinessUnitUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions values to be set
     */

    public void setActions(final List<MyBusinessUnitUpdateAction> actions);

    /**
     * factory method
     * @return instance of MyBusinessUnitUpdate
     */
    public static MyBusinessUnitUpdate of() {
        return new MyBusinessUnitUpdateImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitUpdate of(final MyBusinessUnitUpdate template) {
        MyBusinessUnitUpdateImpl instance = new MyBusinessUnitUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitUpdate deepCopy(@Nullable final MyBusinessUnitUpdate template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitUpdateImpl instance = new MyBusinessUnitUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.me.MyBusinessUnitUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitUpdate
     * @return builder
     */
    public static MyBusinessUnitUpdateBuilder builder() {
        return MyBusinessUnitUpdateBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitUpdateBuilder builder(final MyBusinessUnitUpdate template) {
        return MyBusinessUnitUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitUpdate(Function<MyBusinessUnitUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitUpdate>";
            }
        };
    }
}
