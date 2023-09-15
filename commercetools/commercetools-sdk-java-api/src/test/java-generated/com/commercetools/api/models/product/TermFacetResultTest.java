
package com.commercetools.api.models.product;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class TermFacetResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TermFacetResultBuilder builder) {
        TermFacetResult termFacetResult = builder.buildUnchecked();
        Assertions.assertThat(termFacetResult).isInstanceOf(TermFacetResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TermFacetResult.builder()
                        .dataType(com.commercetools.api.models.product.TermFacetResultType.findEnum("text")) },
                new Object[] { TermFacetResult.builder().missing(3L) },
                new Object[] { TermFacetResult.builder().total(1L) },
                new Object[] { TermFacetResult.builder().other(6L) }, new Object[] { TermFacetResult.builder()
                        .terms(Collections.singletonList(new com.commercetools.api.models.product.FacetTermImpl())) } };
    }

    @Test
    public void dataType() {
        TermFacetResult value = TermFacetResult.of();
        value.setDataType(com.commercetools.api.models.product.TermFacetResultType.findEnum("text"));
        Assertions.assertThat(value.getDataType())
                .isEqualTo(com.commercetools.api.models.product.TermFacetResultType.findEnum("text"));
    }

    @Test
    public void missing() {
        TermFacetResult value = TermFacetResult.of();
        value.setMissing(3L);
        Assertions.assertThat(value.getMissing()).isEqualTo(3L);
    }

    @Test
    public void total() {
        TermFacetResult value = TermFacetResult.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void other() {
        TermFacetResult value = TermFacetResult.of();
        value.setOther(6L);
        Assertions.assertThat(value.getOther()).isEqualTo(6L);
    }

    @Test
    public void terms() {
        TermFacetResult value = TermFacetResult.of();
        value.setTerms(Collections.singletonList(new com.commercetools.api.models.product.FacetTermImpl()));
        Assertions.assertThat(value.getTerms())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.FacetTermImpl()));
    }
}
