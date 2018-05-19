import org.springframework.cloud.contract.spec.Contract

Contract.make{
    description "return tapas with id = 1"

    request{
        method GET()
        url value(consumer(regex('/tapas/[0-9]{1}')), producer('/tapas/1'))
    }

    response{
        status 200
        headers {
            contentType applicationJson()
        }
        body ([
                    id: 1,
                    name: "Banderillas",
                    price: 3
        ])
    }
}