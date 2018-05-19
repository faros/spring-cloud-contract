package be.faros.testing.tapaseater;

import be.faros.testing.tapaseater.gateway.dto.Tapas;
import be.faros.testing.tapaseater.presenter.TapasEaterPresenter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

/*
    TODO step6: Annotate your test class with @AutoConfigureStubRunner
        + set the correct stubsMode & ids
*/
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TapasEater.class)
@AutoConfigureStubRunner(ids = {"be.faros.testing:tapasapp:+:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class TapasEaterTests {

    @Autowired
    private TapasEaterPresenter tapasEaterPresenter;

    /*
        TODO step7: Run the integration test(s), it should pass
    */
    @Test
    public void shouldListAllAvailableTapas() {
    /*
        TODO step1: start by writing the functional test for the new feature (consumer side)
            - retrieve the list of all available tapas using the tapasEaterPresenter.listAvailableTapas()
            - Assert that it returns 2 items
     */
        List<Tapas> tapas = tapasEaterPresenter.listAvailableTapas();
        assertThat(tapas.size()).isEqualTo(2);
    }

    @Test
    public void shouldReturnTapasWithGivenId() {
        Tapas tapas = tapasEaterPresenter.getTapasById("1");
        assertThat(tapas).isNotNull();
        assertThat(tapas.getId()).isEqualTo("1");
        assertThat(tapas.getName()).isEqualTo("Banderillas");
    }
}