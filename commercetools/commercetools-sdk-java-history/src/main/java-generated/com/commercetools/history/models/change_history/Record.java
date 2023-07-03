
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.KeyReference;
import com.commercetools.history.models.common.ResourceIdentifier;
import com.commercetools.history.models.label.Label;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Captures the differences between the previous and next version of a resource.</p>
 *  <p>The maximum number of Records that can be stored and their retention period are subject to a limit.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Record record = Record.builder()
 *             .version(1)
 *             .previousVersion(1)
 *             .type("{type}")
 *             .modifiedBy(modifiedByBuilder -> modifiedByBuilder)
 *             .modifiedAt("{modifiedAt}")
 *             .label(labelBuilder -> labelBuilder)
 *             .previousLabel(previousLabelBuilder -> previousLabelBuilder)
 *             .plusChanges(changesBuilder -> changesBuilder)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .withoutChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecordImpl.class)
public interface Record {

    /**
     *  <p>Version of the resource after the change.</p>
     *  <p>For more information on how the version is incremented, see Optimistic Concurrency Control.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    /**
     *  <p>Version of the resource before the change.</p>
     * @return previousVersion
     */
    @NotNull
    @JsonProperty("previousVersion")
    public Integer getPreviousVersion();

    /**
     *  <p>Indicates the type of change. For creation, update, or deletion, the value is <code>"ResourceCreated"</code>, <code>"ResourceUpdated"</code>, or <code>"ResourceDeleted"</code> respectively.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Information about the user or API Client who performed the change.</p>
     * @return modifiedBy
     */
    @NotNull
    @Valid
    @JsonProperty("modifiedBy")
    public ModifiedBy getModifiedBy();

    /**
     *  <p>Date and time (UTC) when the change was made.</p>
     * @return modifiedAt
     */
    @NotNull
    @JsonProperty("modifiedAt")
    public String getModifiedAt();

    /**
     *  <p>Information that describes the resource after the change.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public Label getLabel();

    /**
     *  <p>Information that describes the resource before the change.</p>
     * @return previousLabel
     */
    @NotNull
    @Valid
    @JsonProperty("previousLabel")
    public Label getPreviousLabel();

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @return changes
     */
    @NotNull
    @Valid
    @JsonProperty("changes")
    public List<Change> getChanges();

    /**
     *  <p>ResourceIdentifier of the changed resource.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public ResourceIdentifier getResource();

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<KeyReference> getStores();

    /**
     *  <p><code>true</code> if no change was detected.</p>
     *  <p>The version number of the resource can be increased even without any change in the resource.</p>
     * @return withoutChanges
     */
    @NotNull
    @JsonProperty("withoutChanges")
    public Boolean getWithoutChanges();

    /**
     *  <p>Version of the resource after the change.</p>
     *  <p>For more information on how the version is incremented, see Optimistic Concurrency Control.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>Version of the resource before the change.</p>
     * @param previousVersion value to be set
     */

    public void setPreviousVersion(final Integer previousVersion);

    /**
     *  <p>Indicates the type of change. For creation, update, or deletion, the value is <code>"ResourceCreated"</code>, <code>"ResourceUpdated"</code>, or <code>"ResourceDeleted"</code> respectively.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>Information about the user or API Client who performed the change.</p>
     * @param modifiedBy value to be set
     */

    public void setModifiedBy(final ModifiedBy modifiedBy);

    /**
     *  <p>Date and time (UTC) when the change was made.</p>
     * @param modifiedAt value to be set
     */

    public void setModifiedAt(final String modifiedAt);

    /**
     *  <p>Information that describes the resource after the change.</p>
     * @param label value to be set
     */

    public void setLabel(final Label label);

    /**
     *  <p>Information that describes the resource before the change.</p>
     * @param previousLabel value to be set
     */

    public void setPreviousLabel(final Label previousLabel);

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes values to be set
     */

    @JsonIgnore
    public void setChanges(final Change... changes);

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>.</p>
     *  <p>The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes values to be set
     */

    public void setChanges(final List<Change> changes);

    /**
     *  <p>ResourceIdentifier of the changed resource.</p>
     * @param resource value to be set
     */

    public void setResource(final ResourceIdentifier resource);

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final KeyReference... stores);

    /**
     *  <p>References to the Stores associated with the Change.</p>
     * @param stores values to be set
     */

    public void setStores(final List<KeyReference> stores);

    /**
     *  <p><code>true</code> if no change was detected.</p>
     *  <p>The version number of the resource can be increased even without any change in the resource.</p>
     * @param withoutChanges value to be set
     */

    public void setWithoutChanges(final Boolean withoutChanges);

    /**
     * factory method
     * @return instance of Record
     */
    public static Record of() {
        return new RecordImpl();
    }

    /**
     * factory method to create a shallow copy Record
     * @param template instance to be copied
     * @return copy instance
     */
    public static Record of(final Record template) {
        RecordImpl instance = new RecordImpl();
        instance.setVersion(template.getVersion());
        instance.setPreviousVersion(template.getPreviousVersion());
        instance.setType(template.getType());
        instance.setModifiedBy(template.getModifiedBy());
        instance.setModifiedAt(template.getModifiedAt());
        instance.setLabel(template.getLabel());
        instance.setPreviousLabel(template.getPreviousLabel());
        instance.setChanges(template.getChanges());
        instance.setResource(template.getResource());
        instance.setStores(template.getStores());
        instance.setWithoutChanges(template.getWithoutChanges());
        return instance;
    }

    /**
     * factory method to create a deep copy of Record
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Record deepCopy(@Nullable final Record template) {
        if (template == null) {
            return null;
        }
        RecordImpl instance = new RecordImpl();
        instance.setVersion(template.getVersion());
        instance.setPreviousVersion(template.getPreviousVersion());
        instance.setType(template.getType());
        instance.setModifiedBy(
            com.commercetools.history.models.change_history.ModifiedBy.deepCopy(template.getModifiedBy()));
        instance.setModifiedAt(template.getModifiedAt());
        instance.setLabel(com.commercetools.history.models.label.Label.deepCopy(template.getLabel()));
        instance.setPreviousLabel(com.commercetools.history.models.label.Label.deepCopy(template.getPreviousLabel()));
        instance.setChanges(Optional.ofNullable(template.getChanges())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change.Change::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setResource(
            com.commercetools.history.models.common.ResourceIdentifier.deepCopy(template.getResource()));
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.KeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setWithoutChanges(template.getWithoutChanges());
        return instance;
    }

    /**
     * builder factory method for Record
     * @return builder
     */
    public static RecordBuilder builder() {
        return RecordBuilder.of();
    }

    /**
     * create builder for Record instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecordBuilder builder(final Record template) {
        return RecordBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecord(Function<Record, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Record> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Record>() {
            @Override
            public String toString() {
                return "TypeReference<Record>";
            }
        };
    }
}
