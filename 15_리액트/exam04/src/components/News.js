import { jseState, useEffect } from "react";

const News = () => {
    useEffect(() => {
        //컴포넌트가 마운트 되었을때 호출
        fetch(
            'https://newsapi.org/v2/top-headlines? country=kr& category=business &apiKey=c39d1c861e5245cab8db477f24baed56',
        )
        .then((res) => re)
    }, []);
    return <></>
}

export default News;