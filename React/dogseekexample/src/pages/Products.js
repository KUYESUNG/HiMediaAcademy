import styles from './Products.module.css';

function Products() {
    
    return(
        <div>
            <div className={styles.header}>
                <div className={styles.headerLeft}>
                    <p>About</p>
                    <p className={styles.pText}>Search</p>
                </div>
                <p className={styles.headerCenter}>DogSeek</p>
                <div className={styles.headerRight}>
                    <p>My Page</p>
                    <p className={styles.pText2}>Logout</p>
                </div>
            </div>
            <div className={styles.mainBox}>
                <p className={styles.curationText}>당신의 강아지를 소개 시켜주세요</p>
                <div className={styles.progressBar}></div>
                <div className={styles.contentBox}>
                    <div className={styles.textBox}>
                        <p className={styles.text}>이름</p>
                        <p className={styles.text}>성별</p>
                        <p className={styles.text}>견종</p>
                        <p className={styles.text}>몸무게</p>
                    </div>
                    <hr className={styles.hr}></hr>
                    <div className={styles.inputBox}>
                        <input className={styles.inputSize} type='text' placeholder='강아지 이름을 입력해주세요'></input>
                        <select className={styles.inputSize}>
                            <option>선택</option>
                            <option>남</option>
                            <option>여</option>
                        </select>
                        <select className={styles.inputSize}>
                            <option>선택</option>
                            <option>말티즈</option>
                            <option>치와와</option>
                            <option>푸들</option>
                            <option>비글</option>
                        </select>
                        <input className={styles.inputSize} type='text' placeholder='강아지 몸무게를 입력해주세요 ex) 4.4kg'></input>
                    </div>
                </div>
                <button className={styles.nextButton}>다음</button>
            </div>
        </div>

        
    );
}

export default Products;