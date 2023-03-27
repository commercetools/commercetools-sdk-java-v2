
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.KeyReference;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.label.Label;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A Record captures the differences in a resource between one version and the next. (Recall that the version number is not always incremented by one; see Optimistic Concurrency Control.)</p>
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
     *  <p>Type of the change (creation, update or deletion).</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Information about the user or the API client who performed the change.</p>
     * @return modifiedBy
     */
    @NotNull
    @Valid
    @JsonProperty("modifiedBy")
    public ModifiedBy getModifiedBy();

    /**
     *  <p>Date and time when the change was made.</p>
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
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @return changes
     */
    @NotNull
    @Valid
    @JsonProperty("changes")
    public List<Change> getChanges();

    /**
     *  <p>Reference to the changed resource.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p>References to the Stores attached to the Change.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<KeyReference> getStores();

    /**
     *  <p><code>true</code> if no change was detected. The version number of the resource can be increased even without any change in the resource.</p>
     * @return withoutChanges
     */
    @NotNull
    @JsonProperty("withoutChanges")
    public Boolean getWithoutChanges();

    /**
     *  <p>Version of the resource after the change.</p>
     * @param version value to be set
     */

    public void setVersion(final Integer version);

    /**
     *  <p>Version of the resource before the change.</p>
     * @param previousVersion value to be set
     */

    public void setPreviousVersion(final Integer previousVersion);

    /**
     *  <p>Type of the change (creation, update or deletion).</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     *  <p>Information about the user or the API client who performed the change.</p>
     * @param modifiedBy value to be set
     */

    public void setModifiedBy(final ModifiedBy modifiedBy);

    /**
     *  <p>Date and time when the change was made.</p>
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
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes values to be set
     */

    @JsonIgnore
    public void setChanges(final Change... changes);

    /**
     *  <p>Shows the differences in the resource between <code>previousVersion</code> and <code>version</code>. The value is not identical to the actual array of update actions sent and is not limited to update actions (see, for example, Optimistic Concurrency Control).</p>
     * @param changes values to be set
     */

    public void setChanges(final List<Change> changes);

    /**
     *  <p>Reference to the changed resource.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     *  <p>References to the Stores attached to the Change.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final KeyReference... stores);

    /**
     *  <p>References to the Stores attached to the Change.</p>
     * @param stores values to be set
     */

    public void setStores(final List<KeyReference> stores);

    /**
     *  <p><code>true</code> if no change was detected. The version number of the resource can be increased even without any change in the resource.</p>
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
     * factory method to copy an instance of Record
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
