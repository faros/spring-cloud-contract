package be.faros.testing.tapasapp;

import be.faros.testing.tapasapp.store.controller.UserBasketManagementController;
import be.faros.testing.tapasapp.store.domain.usecases.UserBasketManagement;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TapasApp.class)
public class StoreBase {

    @Autowired
    UserBasketManagementController userBasketManagementController;

    @MockBean
    UserBasketManagement userBasketManagement;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(userBasketManagementController);

        Mockito.when(userBasketManagement.createNewBasket())
                .thenReturn(1);
    }
}