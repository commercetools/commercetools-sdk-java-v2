
package com.commercetools.history.models.change_history;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecordTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecordBuilder builder) {
        Record record = builder.buildUnchecked();
        Assertions.assertThat(record).isInstanceOf(Record.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", Record.builder().version(2) },
                new Object[] { "previousVersion", Record.builder().previousVersion(9) },
                new Object[] { "type", Record.builder().type("type") },
                new Object[] { "modifiedBy",
                        Record.builder()
                                .modifiedBy(new com.commercetools.history.models.change_history.ModifiedByImpl()) },
                new Object[] { "modifiedAt", Record.builder().modifiedAt("modifiedAt") },
                new Object[] { "label",
                        Record.builder().label(new com.commercetools.history.models.label.LabelImpl()) },
                new Object[] { "previousLabel",
                        Record.builder().previousLabel(new com.commercetools.history.models.label.LabelImpl()) },
                new Object[] { "changes",
                        Record.builder()
                                .changes(Collections
                                        .singletonList(new com.commercetools.history.models.change.ChangeImpl())) },
                new Object[] { "resource",
                        Record.builder()
                                .resource(new com.commercetools.history.models.common.ResourceIdentifierImpl()) },
                new Object[] { "stores",
                        Record.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.history.models.common.KeyReferenceImpl())) },
                new Object[] { "businessUnit",
                        Record.builder().businessUnit(new com.commercetools.history.models.common.KeyReferenceImpl()) },
                new Object[] { "withoutChanges", Record.builder().withoutChanges(true) } };
    }

    @Test
    public void version() {
        Record value = Record.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void previousVersion() {
        Record value = Record.of();
        value.setPreviousVersion(9);
        Assertions.assertThat(value.getPreviousVersion()).isEqualTo(9);
    }

    @Test
    public void type() {
        Record value = Record.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void modifiedBy() {
        Record value = Record.of();
        value.setModifiedBy(new com.commercetools.history.models.change_history.ModifiedByImpl());
        Assertions.assertThat(value.getModifiedBy())
                .isEqualTo(new com.commercetools.history.models.change_history.ModifiedByImpl());
    }

    @Test
    public void modifiedAt() {
        Record value = Record.of();
        value.setModifiedAt("modifiedAt");
        Assertions.assertThat(value.getModifiedAt()).isEqualTo("modifiedAt");
    }

    @Test
    public void label() {
        Record value = Record.of();
        value.setLabel(new com.commercetools.history.models.label.LabelImpl());
        Assertions.assertThat(value.getLabel()).isEqualTo(new com.commercetools.history.models.label.LabelImpl());
    }

    @Test
    public void previousLabel() {
        Record value = Record.of();
        value.setPreviousLabel(new com.commercetools.history.models.label.LabelImpl());
        Assertions.assertThat(value.getPreviousLabel())
                .isEqualTo(new com.commercetools.history.models.label.LabelImpl());
    }

    @Test
    public void changes() {
        Record value = Record.of();
        value.setChanges(Collections.singletonList(new com.commercetools.history.models.change.ChangeImpl()));
        Assertions.assertThat(value.getChanges())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.change.ChangeImpl()));
    }

    @Test
    public void resource() {
        Record value = Record.of();
        value.setResource(new com.commercetools.history.models.common.ResourceIdentifierImpl());
        Assertions.assertThat(value.getResource())
                .isEqualTo(new com.commercetools.history.models.common.ResourceIdentifierImpl());
    }

    @Test
    public void stores() {
        Record value = Record.of();
        value.setStores(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.KeyReferenceImpl()));
    }

    @Test
    public void businessUnit() {
        Record value = Record.of();
        value.setBusinessUnit(new com.commercetools.history.models.common.KeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.history.models.common.KeyReferenceImpl());
    }

    @Test
    public void withoutChanges() {
        Record value = Record.of();
        value.setWithoutChanges(true);
        Assertions.assertThat(value.getWithoutChanges()).isEqualTo(true);
    }
}
