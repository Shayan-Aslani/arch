package io.github.msh91.arch.data.repository

import io.github.msh91.arch.data.model.user.TestUserModel
import io.reactivex.Flowable

class CloudMockRepository : BaseCloudRepository {

    override fun requestUser(testUserModel: TestUserModel): Flowable<TestUserModel> {
        return Flowable.just(testUserModel)
    }
}