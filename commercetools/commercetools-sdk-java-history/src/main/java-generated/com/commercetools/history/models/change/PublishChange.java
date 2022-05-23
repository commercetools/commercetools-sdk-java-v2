
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PublishChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PublishChange publishChange = PublishChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PublishChangeImpl.class)
public interface PublishChange extends Change {

    String PUBLISH_CHANGE = "PublishChange";

    /**
     <>
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     <>
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    public void setChange(final String change);

    public static PublishChange of() {
        return new PublishChangeImpl();
    }

    public static PublishChange of(final PublishChange template) {
        PublishChangeImpl instance = new PublishChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public static PublishChangeBuilder builder() {
        return PublishChangeBuilder.of();
    }

    public static PublishChangeBuilder builder(final PublishChange template) {
        return PublishChangeBuilder.of(template);
    }

    default <T> T withPublishChange(Function<PublishChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PublishChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PublishChange>() {
            @Override
            public String toString() {
                return "TypeReference<PublishChange>";
            }
        };
    }
}
