package contracts.store

import org.springframework.cloud.contract.spec.Contract

Contract.make{
    description "create new basket"

    request{
        method POST()
        url "/basket"
    }

    response{
        status 200
        headers {
            contentType applicationJson()
        }
        body (
                //$(anyNumber()) //doesn't match pattern "-?d*(.d+)?"
                //$(regex(number())) //doesn't match pattern "-?d*(.d+)?"

                $(regex('[0-9]*'))
        )
    }
}