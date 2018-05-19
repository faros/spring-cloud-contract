import org.springframework.cloud.contract.spec.Contract
/*
    TODO step3: create the contract (producer side)
*/
Contract.make{
    description "should return a list of all tapas"

    request{
        method GET()
        url "/tapas"
    }

    response{
        status 200
        headers {
            contentType applicationJson()
        }
        body (
            [
                [
                        id: 0,
                        name: "All i oli",
                        price: 1.5
                ],
                [
                        id: 1,
                        name: "Banderillas",
                        price: 3
                ]
             ]
        )
    }
}